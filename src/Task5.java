import java.util.Scanner;

//Даны координаты точки и радиус круга с центром в начале координат.
//        Определить, принадлежит ли данная точка кругу.
//        Описание переменных:
//        x, y, r - координаты точки и радиус круга;
//        r_xy - длина гипотенузы (расстояния от начала координат до точки).
//        Алгоритм решения задачи:
//        Следует рассмотреть прямоугольный треугольник, один катет которого лежит на любой оси, а другой является перпендикуляром к этой оси из заданной точки. В этом случае длины катетов равны значениям x и y, а гипотенуза является отрезком, соединяющим начало координат с точкой. Если этот отрезок не больше радиуса круга, то делается вывод, что точка принадлежит кругу.
//        Длина гипотенузы находится по теореме Пифагора: a2 + b2 = c2.
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter coordinates of 2 points ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Enter circle radius ");
        int radius = scan.nextInt();
        double c = (double) Math.sqrt((int) (Math.pow(x,2) + Math.pow(y,2)));
        if ( c<= radius){
            System.out.println("points belong to a circle ");
        }
        else {
            System.out.println("points dont belong to a circle ");
        }
    }
}
