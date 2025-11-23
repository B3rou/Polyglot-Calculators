#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;
//Storing the Options as a unordered map :
unordered_map<string, double>UnitToSecounds{
{"Second",1},
{"Minute",60},
{"Hour",3600},
{"Day", 86400}
};
// the Converting function:
double ConvertDuration(string sourceUnit , string targetUnit , double value ){

    double durationInSeconds = value*UnitToSecounds[sourceUnit];
    
    return durationInSeconds / UnitToSecounds[targetUnit];
}

int main(){
    string sourceUnit, targetUnit;
    double value;
    cout<<"\n\nSimple Duration Converter:\n\n";
    while(true){
        cout<<"Source Unit(Second / Minute / Hour / Day ) : ";
        cin>>sourceUnit;
        if(UnitToSecounds.find(sourceUnit)==UnitToSecounds.end()){
            cout<<"Invalied Unit!\n"; 
            continue;
        }
        cout<<"\nTarget Unit(Second / Minute / Hour / Day ) : ";
        cin>>targetUnit;
        if(UnitToSecounds.find(targetUnit)==UnitToSecounds.end()){
            cout<<"Invalied Unit!\n";
            continue;
        }
        cout<<"Enter the value in ("<<sourceUnit<<"s): ";
        cin>>value;
        if(value<0){
            cout<<"Please insert a positive value.\n";
            continue;
        }
        cout<<"Duration in ("<<targetUnit<<"s): "<<ConvertDuration(sourceUnit,targetUnit,value)<<endl;
        char choice;
        cout << "Do you want to convert another value? (y/n): ";
        cin >> choice;
        if (choice != 'y' && choice != 'Y') break;
    }
    cout<<"\nGoodbye";

}