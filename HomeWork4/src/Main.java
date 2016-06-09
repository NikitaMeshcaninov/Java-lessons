import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое двухзначное число:");
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int result = n.charAt(0) + n.charAt(1);
        if (result >= 96 && result <= 114) { //Небольшая проверка на коректность ввода
            System.out.println(n.charAt(0) - 48 + n.charAt(1) - 48);
        } else {
            System.out.println("Некоректный ввод");
        }
    }
}
