class DurationConverter {
    constructor() {
        this.conversionRates = {
    millisecond: 0.001,
    microsecond: 0.000001,
    nanosecond: 0.000000001,
    second: 1,
    minute: 60,
    hour: 3600,
    day: 86400,
    week: 604800,
    month: 2592000,
    year: 31536000,
};

    }

    validateUnit(unit) {
        if (!this.conversionRates[unit]) {
            throw new Error(`Unsupported unit: ${unit}`);
        }
    }

    validateValue(value) {
        if (isNaN(value) || value < 0) {
            throw new Error(`Invalid value: ${value}. Must be a positive number.`);
        }
    }

    convert(value, from, to) {
        this.validateValue(value);
        this.validateUnit(from);
        this.validateUnit(to);

        const valueInSeconds = value * this.conversionRates[from];
        const converted = valueInSeconds / this.conversionRates[to];

        return converted;
    }
}

module.exports = DurationConverter;
