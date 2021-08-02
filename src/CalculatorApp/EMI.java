package CalculatorApp;

import java.util.Scanner;

class EmiCalculation {
    double emi;

    EmiCalculation(double p, double r, double t) {
        emi = (p * r * Math.pow(1 + r, t)) / (Math.pow(1 + r, t) - 1);
    }
}
class EMI{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        double principal, rate, time, emi;

        System.out.println("Enter Principal: ");
        principal = a.nextFloat();

        System.out.println("Enter Rate: ");
        rate = a.nextFloat();

        System.out.println("Enter Time in year: ");
        time = a.nextFloat();

        rate = rate/(12 *100);
        time = time *12;

        EmiCalculation e = new EmiCalculation(principal,rate,time);
        System.out.println("EMI is = " + e.emi+"\n");






    }

}