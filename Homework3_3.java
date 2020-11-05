import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer");
        int number3 = scan.nextInt();
        isEven(number3);
    }

    public static void isEven(int number){
        // method checks whether the given integer is even or odd.
        if(number%2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
