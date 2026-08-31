package middle.taskFour;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 20: ");
        long inputNumber = sc.nextLong();
        long result = 1;

        for (int i = 1; i <= inputNumber; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
