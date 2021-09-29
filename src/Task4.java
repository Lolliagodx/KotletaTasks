import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int firstNumber = enter.nextInt();
        int secondNumber = enter.nextInt();
        System.out.println("enter 2 numbers");
        if (firstNumber % 2 ==0 && secondNumber % 2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
