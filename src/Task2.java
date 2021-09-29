import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter number of days");
        int days = enter.nextInt();
int weeks = days / 7;
int years = days / 365;
        System.out.println("number of days= " + days);
        System.out.println("number of weeks= " + weeks);
        System.out.println("number of years= " +years);

    }
}
