package academits;
import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();;
        int sum = 0;
        while (a != 0) {
            if ((a % 10) % 2 != 0) {
                sum += (a % 10);
            }
            a /= 10;
        }
        System.out.println("Сумма нечетных цифр числа: " + sum);
    }
}
