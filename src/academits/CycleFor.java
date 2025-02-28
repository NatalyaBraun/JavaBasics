package academits;

public class CycleFor {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (isMultipleFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isMultipleFour(int i) {
        return (i % 4 == 0);
    }
}
