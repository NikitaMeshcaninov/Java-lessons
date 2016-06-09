import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Для расчета корней квадоратного уравнения введите его параметры в форме ax^2+bx+c=0");
        System.out.println("Введите первый катет прямоугольного треугольника");
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        System.out.println("Введите второй катет прямоугольного треугольника");
        Scanner sc1 = new Scanner(System.in);
        Double b = sc1.nextDouble();
        Double squer = a*b/2;
        Double perimeter = (a+b)*2;
        System.out.println("Площадь вашего треугольника будет равна " + squer + "\nА его периметер будет равен " + perimeter);
    }
}
