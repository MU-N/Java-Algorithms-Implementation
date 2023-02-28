package com.mycompany.java.algorithms.implementation;

import java.time.Clock;
import java.util.Scanner;

public class StandardDeviation {

    /* formula 
    σ = sqrt [ Σ ( xi - μ )^2 / N ]
    
    
    Where:

    xi is the value of the ith observation
    μ is the mean value of all observations
    N is the total number of observations
    sqrt is the square root function
    
     */
    int arrSize;
    int arr[];
    int sum = 0;
    float meanValue;
    double standardDeviationValue;
    float upValue;

    public StandardDeviation() {
        GetStandardDeviationFromInput();
        ProcessStandardDeviationInput();
        PrintStandardDeviation();
    }

    private void GetStandardDeviationFromInput() {
        System.out.println("Entre The Elnets Count");
        Scanner in = new Scanner(System.in);
        arrSize = in.nextInt();
        arr = new int[arrSize];
        System.out.println("Entre The Elnets Count");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

    }

    private void ProcessStandardDeviationInput() {
        meanValue = sum / arrSize;


        for (int i = 0; i < arrSize; i++) {
            upValue += Math.pow(arr[i] - meanValue, 2);
        }
        
        upValue /= arrSize;
        
        standardDeviationValue =  Math.sqrt(upValue);
    }

    private void PrintStandardDeviation() {
        
        System.out.println("Standard Deviation is: " + standardDeviationValue);
    }
}
