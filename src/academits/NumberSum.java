package academits;

import java.util.Scanner;

public class NumberSum {
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

    }
}











