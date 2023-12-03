#include <iostream>
using namespace std;

int main() {
  cout<<"enter a number in degree celcius: ";
  float celcius;
  cin>> celcius;
  double farenheit = (celcius * 1.8) + 32;
  cout<<celcius<<" degree celcius is "<<farenheit<<" in degree farenheit "<<endl;

  return 0;
   
}


