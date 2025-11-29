#include <iostream>
#include <ostream>
#include <string>
#include <map>
#include "Converter.h"

int main(int argc, char* argv[]) {
    if (argc != 4) {
        std::cerr << "Using: <value> <from unit> <to unit>" << std::endl;
        return 1;
    }

    std::string arg1 = argv[1];
    std::string arg2 = argv[2];
    std::string arg3 = argv[3];
    double value;

    try {
        value = std::stod(arg1);
    }
    catch (const std::exception& e) {
        std::cerr << "Error: " << e.what() << std::endl;
        return 1;
    }

    Converter converter;

    std::map<std::string, Converter::Unit> units = { 
        {"sec", Converter::Unit::seconds},
        {"min", Converter::Unit::minutes},
        {"hour", Converter::Unit::hours},
        {"day", Converter::Unit::days}
    };

    // Check units
    if (!units.count(arg2) || !units.count(arg3)) {
        std::cerr << "Invalid unit" << std::endl;
        return 1;
    }

    double result = converter.Convert(value, units[arg2], units[arg3]);
    std::cout << result << std::endl;

    return 0;
}