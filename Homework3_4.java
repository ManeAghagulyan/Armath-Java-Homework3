import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input length of rectangle");
        double rect_length = scan.nextDouble();
        System.out.println("Input weight of rectangle");
        double rect_weight = scan.nextDouble();
        double rect_perim = getRectanglePerimeter(rect_length, rect_weight);
        System.out.println("Perimeter of rectangle = " + rect_perim);
        double rect_area = getRectangleArea(rect_length, rect_weight);
        System.out.println("Area of rectangle = " + rect_area);
    }

    public static double getRectanglePerimeter(double length, double width){
        // method returns perimeter of rectangle
        return 2 * (length + width);
    }

    public static double getRectangleArea(double length, double width){
        // method returns area of rectangle
        return length * width;
    }
}
