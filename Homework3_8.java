import java.util.Scanner;

public class Homework3_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number ");
        int number = scan.nextInt();
        if (isPrime(number)) {
            System.out.println(" The number is prime");
        }
        else {
            System.out.println("Number isn't prime");
        }
    }

    public static boolean isPrime (int n){
        //  method indicates whether the integer is prime or not
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n / 2; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }
}