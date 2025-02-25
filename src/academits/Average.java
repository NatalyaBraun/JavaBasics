package academits;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        double a = scanner.nextInt();

        System.out.println("Введите конец диапазона: ");
        double b = scanner.nextInt();
        double sum = 0;
        double qty = 0;
        double evenSum = 0;
        double evenQty = 0;

        for (double i = a; i <= b; i++) {
            sum += i;
            qty++;
            if (i % 2 == 0) {
                evenQty++;
                evenSum += i;
            }
        }

        double average = getAverage(sum, qty);
        System.out.println("Среднее арифметическое диапазона = " + average);

        double evenAverage = getAverage(evenSum, evenQty);
        System.out.println("Среднее арифметическое четного диапазона = " + evenAverage);
    }

    public static double getAverage(double sum, double qty) {
        return (double) (sum) / qty;
    }
}
