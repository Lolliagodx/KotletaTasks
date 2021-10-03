import java.util.Scanner;

//Создайте игру «Камень, ножницы, бумага». Оба игрока должны ввести слово rock, paper или scissors и в зависимости от введенного слова программа будет определять победителя и выводить информацию об этом на экран.
//        Сделайте сравнение выбранных данных в виде функции, которая будет возвращать результат.
//        Требование: игроки будут вводить данные используя Scanner. Вам необходимо сравнивать данные и определять кто выиграл.
//        Правила:
//        Камень бьет ножницы;
//        Ножницы бьют бумагу;
//        Бумага бьет камень.
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("player # 1, enter paper, rock or scissors");
        String player1 = scan.nextLine();
        System.out.println("player # 2, enter paper, rock or scissors");
        String player2 = scan.nextLine();
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        if (player1.equals(rock) || player1.equals(paper) || player1.equals(scissors)) {

            if (player2.equals(rock) || player2.equals(paper) || player2.equals(scissors))

                if (player1.equals(rock) && player2.equals(paper)) {
                    System.out.println("player # 2 won");
                }
            if (player1.equals(rock) && player2.equals(scissors)) {
                System.out.println("player # 1 won");
            }
            if (player1.equals(rock) && player2.equals(rock)) {
                System.out.println("draw!");
            }
            if (player1.equals(paper) && player2.equals(paper)) {
                System.out.println("draw!");
            }
            if (player1.equals(paper) && player2.equals(rock)) {
                System.out.println("player # 1 won");
            }
            if (player1.equals(paper) && player2.equals(scissors)) {
                System.out.println("player # 2 won");
            }
            if (player1.equals(scissors) && player2.equals(scissors)) {
                System.out.println("draw!");
            }
            if (player1.equals(scissors) && player2.equals(paper)) {
                System.out.println("player # 1 won");
            }
            if (player1.equals(scissors) && player2.equals(rock)) {
                System.out.println("player # 2 won");
            }
        }
        else {
            System.out.println("enter - rock, paper or scissors!");
        }
        }
}
