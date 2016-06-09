import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Man man1 = new Man();
        man1.Data = 247518992;
        for (; ; ) {
            System.out.println("Напишите \"1\" без ковычек если хотите ввести " +
                    "данные \nили напишите \"2\" если хотите вывести данные на экран");
            Scanner sc = new Scanner(System.in);

            int ansuer = sc.nextInt();
            if (ansuer == 1) {
                man1.Data = man1.inserter();
            } else if (ansuer == 2) {
                man1.extractor();
            }
            else {break;}

        }
    }
}
