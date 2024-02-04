#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double mean, standardDev, variance, sum = 0, sumDev = 0;
    int i, size;

    std::cout<<"Enter the size: ";
    std::cin>>size;

    double* array = new double[size];

    for (i = 0; i <= size; i++){
        std::cout<<"array["<<i<<"] = ";
        std::cin>>array[i];
        sum += array[i];
    }
    mean = sum / size;
    
    for (i = 0; i < size; i++){
        sumDev += pow(array[i] - mean, 2);
    } 
    variance = sumDev / size;
    standardDev = sqrt(variance);

    std::cout<<endl;
    std::cout<<"Mean = "<<mean<<endl;
    std::cout<<"Total Deviation = "<<sumDev<<endl;
    std::cout<<"Variance = "<<variance<<endl;
    std::cout<<"Standard Deviattion = "<<standardDev<<endl;

    delete[] array;
    
    return 0;
}