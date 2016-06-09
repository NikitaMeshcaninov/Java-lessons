import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число...");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println("Введите второе число...");
        Scanner sc2 = new Scanner(System.in);
        double m = sc2.nextDouble();
        System.out.println("Первое число " + n);
        System.out.println("Второе число " + m);
        if (n == 10 | m == 10) {
            System.out.println("Одно или оба чисела равны 10");
        }
        if (n > 10 && m > 10) {
            if (n < m) {
                System.out.println("Первое ближе");
            } else if (n > m) {
                System.out.println("Второе ближе");
            } else System.out.println("Числа равны");
        }
        if (n < 10 && m < 10) {
            if (n > m) {
                System.out.println("Первое ближе");
            } else if (n < m) {
                System.out.println("Второе ближе");
            } else System.out.println("Числа равны");
        }
        if (n < 10 && m > 10) {
            double a = 10.0 - n;
            double b = m - 10.0;
            if (a < b) {
                System.out.println("Первое ближе");
            } else if (a > b) {
                System.out.println("Второе ближе");
            } else System.out.println("Числа на одинаковом расстоянии11");
        }
        if (n > 10 && m < 10) {
            double a = 10.0 - n;
            double b = m - 10.0;
            if (a > b) {
                System.out.println("Первое ближе");
            } else if (a < b) {
                System.out.println("Второе ближе");
            } else System.out.println("Числа на одинаковом расстоянии");
        }
    }
}
