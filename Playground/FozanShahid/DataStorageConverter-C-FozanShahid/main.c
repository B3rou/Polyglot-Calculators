#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

/* Cross-platform compatibility for strcasecmp() */
#ifdef _WIN32
    #define strcasecmp _stricmp
#else
    #include <strings.h>
#endif

const char *UNIT_SHORT[] = {"b", "B", "KB", "MB", "GB", "TB", "PB"};
const char *UNIT_LONG[]  = {"Bits", "Bytes", "Kilobytes", "Megabytes", "Gigabytes", "Terabytes", "Petabytes"};
const double FACTOR_IN_BYTES[] = {
    1.0 / 8.0,           /* b */
    1.0,                 /* B */
    1024.0,              /* KB */
    1024.0 * 1024.0,     /* MB */
    1024.0 * 1024.0 * 1024.0,           /* GB */
    1024.0 * 1024.0 * 1024.0 * 1024.0,  /* TB */
    1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0 /* PB */
};
const int UNIT_COUNT = 7;

void display_menu(void) {
    printf("\n💾 Data Storage Units (JEDEC Standard):\n");
    for (int i = 0; i < UNIT_COUNT; ++i) {
        printf("  %d. %s (%s)\n", i + 1, UNIT_LONG[i], UNIT_SHORT[i]);
    }
}

/* Read a line from stdin into buf (size n). Returns 0 on success, -1 on EOF. */
int read_line(char *buf, size_t n) {
    if (fgets(buf, (int)n, stdin) == NULL) return -1;
    size_t len = strlen(buf);
    if (len > 0 && buf[len - 1] == '\n') buf[len - 1] = '\0';
    return 0;
}

/* Returns index 0..UNIT_COUNT-1, or -1 if user typed "exit". */
int get_unit_choice(const char *prompt) {
    char buf[128];
    while (1) {
        printf("%s", prompt);
        if (read_line(buf, sizeof(buf)) < 0) return -1;
        if (strcasecmp(buf, "exit") == 0) return -1;
        char *endptr;
        long val = strtol(buf, &endptr, 10);
        if (endptr != buf && *endptr == '\0' && val >= 1 && val <= UNIT_COUNT) {
            return (int)(val - 1);
        }
        printf("  [Error] Invalid choice. Please enter a number between 1 and %d or type 'exit'.\n", UNIT_COUNT);
    }
}

/* Returns 0 on success and writes value to *out_value, or -1 if 'exit' or EOF. */
int get_value(double *out_value) {
    char buf[256];
    while (1) {
        printf("Enter the value to convert: ");
        if (read_line(buf, sizeof(buf)) < 0) return -1;
        if (strcasecmp(buf, "exit") == 0) return -1;
        errno = 0;
        char *endptr;
        double v = strtod(buf, &endptr);
        if (endptr != buf && *endptr == '\0' && errno == 0) {
            *out_value = v;
            return 0;
        }
        printf("  [Error] Invalid input. Please enter a number or type 'exit'.\n");
    }
}

int main(void) {
    printf("--- 💾 Data Storage Converter ---\n");
    printf("Using JEDEC standard (1 KB = 1024 Bytes)\n");
    printf("Type 'exit' at any time to quit.\n");

    while (1) {
        display_menu();

        int from_idx = get_unit_choice("\nConvert FROM (select a number): ");
        if (from_idx < 0) break;

        int to_idx = get_unit_choice("Convert TO (select a number): ");
        if (to_idx < 0) break;

        double value;
        if (get_value(&value) < 0) break;

        /* perform conversion */
        double value_in_bytes = value * FACTOR_IN_BYTES[from_idx];
        double result = value_in_bytes / FACTOR_IN_BYTES[to_idx];

        printf("\n--- Result ---\n");
        printf("%.12g %s = %.12g %s\n", value, UNIT_SHORT[from_idx], result, UNIT_SHORT[to_idx]);
        printf("-------------------------\n");
    }

    printf("\nThank you for using the converter. Goodbye!\n");
    return 0;
}
