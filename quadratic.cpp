#include <iostream>
#include <cmath>
using namespace std;

int main () {
    int a, b, c;
    sring root_1, root_2;
    cout<<"enter values for a: ";
    cin>>a;
    cout<<"enter values for b: ";
    cin>>b;
    cout<<"enter values for c: ";
    cin>>c;

    double disc = b * b - 4 * a * c;

    if (disc < 0 ){
        cout<<"Roots are imaginary ";

        else
        double root_1 = (- b + sqrt(disc)) / 2 * a;
        double root_2 = (- b - sqrt(disc)) / 2 * a;
    }
    cout<<root_1<<endl;
    cout<<root_2<<endl;
    
    if (root_1 = root_2){
        cout<<"Roots are equal";

        else
        cout<<"Roots are unequal";
    }

    return 0;

}