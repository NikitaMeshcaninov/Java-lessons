import java.util.Scanner;

public class Man {
    public int Data;

    public int inserter() {
        System.out.println("Введите возраст");
        Scanner sc0 = new Scanner(System.in);
        String a = sc0.next();

        System.out.println("Введите вес");
        Scanner sc1 = new Scanner(System.in);
        String b = sc1.next();

        System.out.println("Введите рост");
        Scanner sc2 = new Scanner(System.in);
        String c = sc2.next();

        System.out.println("Введите последние 2 цыфры года рождения");
        Scanner sc3 = new Scanner(System.in);
        String d = sc3.next();
        Integer x = Integer.valueOf(a + b + c + d);
        return x;
    }

    public void extractor() {
        String x = Integer.toString(Data);
        System.out.println("Возраст = " + x.substring(0, 2));
        System.out.println("Вес = " + x.substring(2, 4));
        System.out.println("Рост = " + x.substring(4, 7));
        System.out.println("Год рождения = " + x.substring(7));
    }
}
