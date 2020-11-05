import java.util.Scanner;

public class Homework3_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number a ");
        int a = scan.nextInt();
        System.out.println("Input number b ");
        int b = scan.nextInt();
        System.out.println("Input number c ");
        int c = scan.nextInt();
        solveQuadraticEquation(a, b, c);
    }

    public static void solveQuadraticEquation (int a, int b, int c){
        //  method solves quadratic equation using the quadratic formula and prints the roots
        if (a == 0) {
            System.out.println("Coefficient a is 0");
            }
        else {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println(" x1 = " + x1);
                System.out.println(" x2 = " + x2);
                return;
            }
            else if (D == 0) {
                double x = -b / (2 * a);
                System.out.println(" x = " + x);
                return;
            }
            else {
                System.out.println("Equation has complex roots");
                return;
            }
        }
    }
}
