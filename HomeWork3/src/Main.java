import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean Flag = false;
        while (Flag == false) {
            System.out.println("Введите целое число:");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    System.out.println("Ваше число четное");
                } else {
                    System.out.println("Ваше число не четное");
                }
                Flag = true;
            } else {
                System.out.println("Вы написали какую-то дичь, попробуйте еще раз...");
            }
        }
    }

}

