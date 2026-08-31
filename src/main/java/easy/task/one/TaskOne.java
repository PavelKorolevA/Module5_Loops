package easy.task.one;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Введите степень: ");
        int degree = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *= number;
        }
        System.out.println("Результат: " + result);
    }
}
