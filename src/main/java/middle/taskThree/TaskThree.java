package middle.taskThree;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100: ");
        int numberOne = sc.nextInt();

        if (numberOne < 1 || numberOne > 100) {
            System.out.println("Введено неверное значение");
        }

        for (int i = 1; i <= numberOne; i++) {
            if (numberOne % i == 0 && i != 1 && i != numberOne) {
                System.out.println(i);
            }
        }
    }
}
