package academits;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        int sum = 0;

        while (a != 0) {
            sum += (a % 10);
            a /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);

        int evenSum = 0;
        while (a != 0) {
            if ((a % 10) % 2 != 0) {
                evenSum += (a % 10);
            }
            a /= 10;
        }
        System.out.println("Сумма нечетных цифр числа: " + evenSum);

        int max = 0;
        while (a != 0) {
            if (a % 10 > max) max = (int) (a % 10);
            a /= 10;
        }
        System.out.println("Максимальная цифра числа = " + max);
    }
}
