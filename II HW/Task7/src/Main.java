import java.util.Scanner;

public class Main {

    int result = 0;
    int lastAddNumber = 0;

    public static void main(String[] args) {
        System.out.println("Enter your Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        RecursionClass ansuer = new RecursionClass();


        for (int i = 0;i<number;i++)
        result+=ansuer.recursionMethod(number-i);
        System.out.println(result);
    }
}
