package academits;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        while (name.length() == 0) {
            System.out.print("Введите ваше имя: ");
            name = scanner.nextLine();
        }

        System.out.println("Привет, " + name + "!");
    }
}
