#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double a, b, c,disc, root1, root2;
    cout<<"Enter a: ";
    cin>>a;
    cout<<"Enter b: ";
    cin>>b;
    cout<<"Enter c: ";
    cin>>c;
    disc = b * b - 4 * a * c;
    if(disc < 0)
    cout<<"Roots are imaginary";
    else{
      root1 = (-b + sqrt(disc))/(2 * a);
      root2 = (-b - sqrt(disc))/(2 * a);
      cout<<"Root 1 is "<<root1<<"and Root 2 is "<<root2<<endl;
    }
      if(root1==root2)
      cout<<"Equal Roots ";
      else{
        cout<<"Unequal Roots ";
      }
    return 0;
}