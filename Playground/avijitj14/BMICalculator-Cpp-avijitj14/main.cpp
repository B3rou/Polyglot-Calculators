#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int weight;
    float height, bmi;

    //Input weight in kg
    cout << "Enter weight in kg:" << endl;
    cin >> weight;

    //Input height in metres
    cout << "Enter height in metres:" << endl;
    cin >> height;

    //Calculate BMI using formula
    bmi = weight/(height * height);

    //Truncate to decimal places
    cout << fixed << setprecision(2);

    //Output result and category
    if(bmi < 18.5)
        cout << "BMI:" << bmi << " " << "(Underweight)" << endl;

    if(bmi >= 18.5 && bmi < 25)
        cout << "BMI:" << bmi << " " << "(Normal weight)" << endl;
    
    if(bmi >= 25 && bmi < 30)
        cout << "BMI:" << bmi << " " << "(Overweight)" << endl;

    if(bmi >= 30)
        cout << "BMI:" << bmi << " " << "(Obese)" << endl;
}