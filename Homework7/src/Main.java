import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Для расчета корней квадоратного уравнения введите его параметры в форме ax^2+bx+c=0");
        System.out.println("Введите а");
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        System.out.println("Введите b");
        Scanner sc1 = new Scanner(System.in);
        Double b = sc1.nextDouble();
        System.out.println("Введите c");
        Scanner sc2 = new Scanner(System.in);
        Double c = sc2.nextDouble();
        if (b * b - 4 * a * c < 0) {
            System.out.println("Ничего не выйдет - дискриминант отрицательный");
        } else {
            if (b * b - 4 * a * c == 0) {
                double x1 = (b * (-1)) / 2 * a;
                double x2 = x1;
                System.out.println("x1 = x2 = " + x1);
            } else {
                double x1 = b * (-1) + Math.sqrt(b * b - 4 * a * c);
                double x2 = b * (-1) - Math.sqrt(b * b - 4 * a * c);
                x1 /= 2*a;
                x2 /= 2*a;
                System.out.println("x1 = " + x1 + "  x2 = " + x2);
            }
        }
    }
}
