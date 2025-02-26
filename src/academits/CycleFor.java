package academits;

public class CycleFor {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            isMultipleFour(i);
        }
    }

    private static void isMultipleFour(int i) {
        if (i % 4 == 0) {
            System.out.print(i + " ");
        }

//    public static boolean isMultipleFour(int i) {
//        if (i % 4 == 0) {
//            System.out.print(i + " ");
//        }
//        return false;
    }
}