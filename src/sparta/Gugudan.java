package sparta;

import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 구구단을 입력하세요: ");
        int gugu = scanner.nextInt();

        System.out.println("==== " + gugu + "단 ====");

        for (int i = 1; i <= 9; i++) {
            int result = gugu * i;
            System.out.println(gugu + " * " + i + " = " + result);
        }

    }
}
