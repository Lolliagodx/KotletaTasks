import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//* Буквы
//        * Напишите программу , которая вводит с клавиатуры текст.
//        * Программа должна вывести на экран:
//        * 1. количество гласных и согласных букв - вывести "количество гласных ", "количесвто согласных"
//        * 2. удвоить все гласные буквы - вывести текст
//        * 3. @param toUpperCase вывести на экране введенную строку в верхнем регистре
public class vowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text");
        String word = scan.nextLine();
        Pattern vowels = Pattern.compile("[аеуоыиёюяэ]");
        Pattern consonants = Pattern.compile("[йцкнгшщзхъфвпрлджчсмтьб]");


    }
public static void checkReg (Pattern pattern, String text){
    Matcher matcher = pattern.matcher(text);
}



}
