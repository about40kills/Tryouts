#include<iostream>

int main() {

int a = 3;
int b = 4;
int k = a;
 a = b;
 b = k;
std::cout<<"the value of a is "<<a<< std::endl;
std::cout<<"the value of b is "<<b<< std::endl;
  
  int sales = 95000;
  const double state_tax = 0.04 * sales;
  const double counter_tax = 0.02 * sales;

  std::cout<<"the value of sales is : $"<<sales<< std::endl; 
  std::cout<<"the value of state_tax is : $"<<state_tax<< std::endl;
  std::cout<<"the value of counter_tax is : $"<<counter_tax<< std::endl;

  double total_tax = state_tax + counter_tax;
  std::cout<<"the value of total_tax is : $ "<<total_tax<< std::endl;
  return 0;
}