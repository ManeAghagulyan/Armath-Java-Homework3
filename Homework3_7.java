import java.util.Scanner;

public class Homework3_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input day ");
        int day = scan.nextInt();
        dayOfWeek(day);
    }

    public static void dayOfWeek (int day){
        //  method displays the name of the weekday
        switch(day) {
            case 1:
                System.out.println("Monday");
                return;
            case 2:
                System.out.println("Tuesday");
                return;
            case 3:
                System.out.println("Wednesday");
                return;
            case 4:
                System.out.println("Thursday");
                return;
            case 5:
                System.out.println("Friday");
                return;
            case 6:
                System.out.println("Saturday");
                return;
            case 7:
                System.out.println("Sunday");
                return;
            default:
                System.out.println("Wrong day");
                return;
        }
    }
}