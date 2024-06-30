//Braden Heeney
//CSC320-1
//Module 3 Critical Thinking - Optio #1
//Calculate Average Witholding

import java.util.Scanner;

public class AverageWitholding{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("     Calculate Avereage Witholding\n");
        System.out.print("=======================================\n");
        System.out.print("Please enter weekly income: ");
        double income = s.nextDouble();
        double taxRate;
        if (income < 500){
            taxRate = 0.10; 
        }
        else if (income >= 500 && income < 1500){
            taxRate = 0.15;
        }
        else if (income >= 1500 && income < 2500){
            taxRate = 0.20;
        }
        else {
            taxRate = 0.30;
        }
        System.out.printf("income: %.2f\n",income);
        System.out.printf("Tax Rate: %.1f%%\n", taxRate * 100);
        double tax = income * taxRate;
        System.out.printf("Tax Witholdings: $ %.2f", tax);
        s.close();
    }
}