#pragma once

#include <iostream>
#include <string>
#include <sstream>

class Converter {
    // Constants
    static constexpr double secondsInMinute_ = 60;
    static constexpr double secondsInHour_ = 3600;
    static constexpr double secondsInDay_ = 86400;

public:
    enum class Unit { seconds, minutes, hours, days };

    double Convert(double value, Unit from, Unit to);
};