#include "Converter.h"

double Converter::Convert(double value, Unit from, Unit to) {
    // Convert value to seconds
    switch (from) {
        case Unit::seconds:
        break;

        case Unit::minutes:
        value *= secondsInMinute_;
        break;

        case Unit::hours:
        value *= secondsInHour_;
        break;

        case Unit::days:
        value *= secondsInDay_;
        break;
    }

    switch (to) {
        case Unit::seconds:
        return value;

        case Unit::minutes:
        return value / secondsInMinute_;

        case Unit::hours:
        return value / secondsInHour_;

        case Unit::days:
        return value / secondsInDay_;
    }

    // Just in case
    return value;
}