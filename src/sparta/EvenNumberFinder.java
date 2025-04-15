package sparta;

public class EvenNumberFinder {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 10, 15, 20, 22, 24, 30, 100};

        System.out.print("짝수: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}

