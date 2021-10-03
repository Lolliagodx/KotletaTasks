import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
       int number = enter.nextInt();


if ( number / 10000 <= 9 && number / 10000 != 0){


    int number1 = number / 10000;
    int number2 = (number / 1000) % 10;
    int number3 = (number / 100) % 10;
    int number4 = (number / 10) % 10;
    int number5 = number % 10;
    System.out.println("Divided numbers: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5+".");
}


else {
    System.out.println("Enter 5 digit number!");
}
    }
}
