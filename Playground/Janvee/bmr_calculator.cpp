#include <bits/stdc++.h>
using namespace std;
int main(){
    cout << "=== BMR Calculator ===\n";
    char gender;
    cout<<"Enter your gender (M/F): "; 
    cin>>gender;   
    if(toupper(gender)!='M'&& toupper(gender)!='F'){
        cout<<"Invalid Input for gender!";
        return 0;
    }
    double weight,height;
    int age;
    cout<<"Enter your age(in years): ";
    cin>>age;
    cout<<"Enter your height(in cm): ";
    cin>>height;
    cout<<"Enter your weight(in kg): ";
    cin>>weight;
    double bmr=(10*weight)+(6.25*height)-(5*age);
    if(toupper(gender)=='F'){
        bmr-=161;
    }
    else{
        bmr+=5;
    }
    cout<<"Your Basal Metabolic Rate is: "<<fixed<<setprecision(2)<<bmr<<" calories/day";
}