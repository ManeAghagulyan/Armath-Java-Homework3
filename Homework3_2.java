import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer");
        double number2 = scan.nextDouble();
        isPositive(number2);
    }
    public static void isPositive(double number){
        // method checks whether the given integer is positive or negative.
        if (number > 0) {
            System.out.println(number + " is positive");
        }
        else if(number == 0) {
            System.out.println("0 is is neither positive nor negative");
        }
        else {
            System.out.println(number + " is negative");
        }
    }
}
