const DurationConverter = require("./src/DurationConverter");

const converter = new DurationConverter();

const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

const units = [
    "millisecond",
    "second",
    "minute",
    "hour",
    "day",
    "week",
    "month",
    "year",
];

function displayUnits() {
    console.log("Supported Units:");
    units.forEach((u) => {
        console.log(` • ${u}`);
    });
    console.log();
}

function showBanner() {
    console.log("\n===============================");
    console.log(" 🔢  Duration Converter (JS) ");
    console.log("===============================");
    displayUnits();
    console.log("===============================\n");
}

// Helper: clean and parse user input
function parseInput(raw) {
    const trimmed = raw.trim().replace(/\s+/g, " ");
    const parts = trimmed.split(" ");

    if (parts.length !== 3) {
        throw new Error(
            "Invalid format. Use: <value> <from-unit> <to-unit> (e.g., 3600 second hour)"
        );
    }

    return parts;
}

function askConversion() {
    readline.question(
        "Enter value, from-unit, to-unit\n(e.g., 3600 second hour): ",
        (input) => {
            try {
                const [valueStr, from, to] = parseInput(input);
                const value = Number(valueStr);

                const result = converter.convert(value, from, to);
                console.log(`\n➡️  Converted Value: ${result}\n`);
            } catch (error) {
                console.error(`\n❌ Error: ${error.message}\n`);
            }

            askAgain();
        }
    );
}

function askAgain() {
    readline.question("Do you want to convert again? (yes/no): ", (answer) => {
        const clean = answer.trim().toLowerCase();

        if (clean === "yes" || clean === "y") {
            console.log("\n--------------------------------\n");
            askConversion();
        } else {
            console.log("\nThanks for using Duration Converter! Goodbye 👋\n");
            readline.close();
        }
    });
}

// Start program
showBanner();
askConversion();
