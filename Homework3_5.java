import java.util.Scanner;

public class Homework3_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input radius of circle ");
        double radius = scan.nextDouble();
        double circle_perim = getCirclePerimeter(radius);
        System.out.println("Perimeter of circle = " + circle_perim);
        double circle_area = getCircleArea(radius);
        System.out.println("Perimeter of circle = " + circle_area);
    }

    public static double getCirclePerimeter(double radius){
        // method returns perimeter of circle
        return 2 * 3.14 * radius;
    }

    public static double getCircleArea(double radius) {
        // method returns area of circle
        return 2 * 3.14 * radius * radius;
    }
}
