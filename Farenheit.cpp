#include <iostream>
using namespace std;

int main() {
 cout<<"enter a number in degree farenheit: ";
  float farenheit;
  cin>> farenheit;
  double celcius = (farenheit - 32) / (1.8);
  cout<<farenheit<<" degree farenheit is "<<celcius<<" in degree celcius "<<endl;
  
  return 0;

}  