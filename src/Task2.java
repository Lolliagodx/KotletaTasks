import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter number of days");
        int enterDays = enter.nextInt();
int years = enterDays / 365;
int leapDays = years/4;
int remainingDaysOfTheYear = ((enterDays +leapDays)  % 365);
int weeks = ((enterDays +leapDays)  % 365) / 7;
int days = weeks % 7;
        System.out.println(years + " Years, " + weeks+ " weeks, " + days + " days.");

    }
}
