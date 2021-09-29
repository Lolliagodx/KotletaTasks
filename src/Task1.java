import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String number = enter.nextLine();
        int five = number.length();

if ( five == 5 ){

    char[] massive = number.toCharArray();
    for(int i = 0; i < massive.length; i++) {

        System.out.print(massive[i] + " ");
}

}
else {
    System.out.println("Enter 5 digit number!");
}
    }
}
