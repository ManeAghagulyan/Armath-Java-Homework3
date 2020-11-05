import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args){
        //Homework 3.1
        Scanner scan = new Scanner(System.in);
        System.out.println("Checing average function");
        System.out.println("Input 1st number");
        double firstNumber = scan.nextDouble();
        System.out.println("Input 2nd number");
        double secondNumber = scan.nextDouble();
        System.out.println("Input 3th number");
        double thirdNumber = scan.nextDouble();
        System.out.println("Average = " + getAverage(firstNumber, secondNumber, thirdNumber));
    }

    public static double getAverage(double a, double b, double c) {
        //  method returns the average of three numbers
        return (a + b + c) / 3;
    }
}
