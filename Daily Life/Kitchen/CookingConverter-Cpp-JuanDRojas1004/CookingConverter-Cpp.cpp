#include <iostream>
using namespace std;

// ----- Conversion functions 

double cupsToTbsp(double cups) { return cups * 16.0; }
double tbspToCups(double tbsp) { return tbsp / 16.0; }

double tbspToTsp(double tbsp) { return tbsp * 3.0; }
double tspToTbsp(double tsp) { return tsp / 3.0; }

double cupsToMl(double cups) { return cups * 250.0; }  
double mlToCups(double ml) { return ml / 250.0; }

double tbspToMl(double tbsp) { return tbsp * 15.0; }
double mlToTbsp(double ml) { return ml / 15.0; }

// ----- Menu 

void showMenu() {
    cout << "\n===== Cooking Measurement Converter =====\n";
    cout << "1. Cups -> Tablespoons\n";
    cout << "2. Tablespoons -> Cups\n";
    cout << "3. Tablespoons -> Teaspoons\n";
    cout << "4. Teaspoons -> Tablespoons\n";
    cout << "5. Cups -> Milliliters\n";
    cout << "6. Milliliters -> Cups\n";
    cout << "7. Tablespoons -> Milliliters\n";
    cout << "8. Milliliters -> Tablespoons\n";
    cout << "0. Exit\n";
    cout << "Choose an option: ";
}

int main() {
    int option = -1;
    double value;

    do {
        showMenu();
        cin >> option;

        if (option == 0) {
            cout << "Goodbye!\n";
            break;
        }

        cout << "Enter value: ";
        cin >> value;

        switch (option) {
            case 1:
                cout << value << " cups = " << cupsToTbsp(value) << " tbsp\n";
                break;
            case 2:
                cout << value << " tbsp = " << tbspToCups(value) << " cups\n";
                break;
            case 3:
                cout << value << " tbsp = " << tbspToTsp(value) << " tsp\n";
                break;
            case 4:
                cout << value << " tsp = " << tspToTbsp(value) << " tbsp\n";
                break;
            case 5:
                cout << value << " cups = " << cupsToMl(value) << " ml\n";
                break;
            case 6:
                cout << value << " ml = " << mlToCups(value) << " cups\n";
                break;
            case 7:
                cout << value << " tbsp = " << tbspToMl(value) << " ml\n";
                break;
            case 8:
                cout << value << " ml = " << mlToTbsp(value) << " tbsp\n";
                break;
            default:
                cout << "Invalid option. Try again.\n";
        }

    } while (option != 0);

    return 0;
}
