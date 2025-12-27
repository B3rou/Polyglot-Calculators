#include <stdio.h>
#include <math.h>

/* Function to safely read a float */
int readFloat(const char *prompt, float *value) {
    printf("%s", prompt);
    if (scanf("%f", value) != 1) {
        printf("Error: Invalid input. Please enter a numeric value.\n");
        return 0;
    }
    return 1;
}

int main() {
    float a, b, c;
    float discriminant;
    float realPart, imaginaryPart;

    if (!readFloat("Enter coefficient a: ", &a)) return 1;

    if (a == 0) {
        printf("Error: 'a' cannot be zero. This is not a quadratic equation.\n");
        return 1;
    }

    if (!readFloat("Enter coefficient b: ", &b)) return 1;
    if (!readFloat("Enter coefficient c: ", &c)) return 1;

    discriminant = (b * b) - (4 * a * c);

    printf("\nDiscriminant = %.2f\n", discriminant);

    if (discriminant > 0) {
        float x1 = (-b + sqrt(discriminant)) / (2 * a);
        float x2 = (-b - sqrt(discriminant)) / (2 * a);

        printf("Two distinct real roots:\n");
        printf("x1 = %.3f\n", x1);
        printf("x2 = %.3f\n", x2);
    }
    else if (discriminant == 0) {
        float x = -b / (2 * a);
        printf("One real root:\n");
        printf("x = %.3f\n", x);
    }
    else {
        realPart = -b / (2 * a);
        imaginaryPart = sqrt(-discriminant) / (2 * a);

        printf("Two complex roots:\n");
        printf("x1 = %.3f + %.3fi\n", realPart, imaginaryPart);
        printf("x2 = %.3f - %.3fi\n", realPart, imaginaryPart);
    }

    return 0;
}
