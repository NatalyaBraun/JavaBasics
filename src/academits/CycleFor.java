package academits;

import java.util.Scanner;

public class CycleFor {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }

        boolean even = isMultipleFour();
    }

    private static boolean isMultipleFour() {
        return false;
    }
}
