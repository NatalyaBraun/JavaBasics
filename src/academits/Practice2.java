package academits;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        if (name.length() > 0) {
            System.out.println("Привет, " + name + "!");
        } else {
            System.out.println("Привет, неизвестный!");
        }
    }
}
