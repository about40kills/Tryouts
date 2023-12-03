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
        cout<<"array["<<i<<"] = ";
        cin>>array[i];
        sum += array[i];
    }
    mean = sum / size;
    
    for (i = 0; i < size; i++){
        sumDev += pow(array[i] - mean, 2);
    } 
    variance = sumDev / size;
    standardDev = sqrt(variance);

    cout<<endl;
    cout<<"Mean = "<<mean<<endl;
    cout<<"Total Deviation = "<<sumDev<<endl;
    cout<<"Variance = "<<variance<<endl;
    cout<<"Standard Deviattion = "<<standardDev<<endl;

    delete[] array;
    
    return 0;
}