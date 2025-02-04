package academits;
import java.util.Scanner;

public class CycleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            for (int i = 100; i >= 1; i--) {
                if (i % 4 == 0)

                    System.out.print(i + " ");
            }
        }
    }
}



