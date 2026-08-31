package hard.two;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayLengthInput = sc.nextInt();  // (1)

        if (arrayLengthInput < 1 || arrayLengthInput > 1000) {
            System.out.println("Длина массива должна быть не более 1000 элементов");
            return;
        }

        int[] arrayElementsInput = new int[arrayLengthInput];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arrayLengthInput; i++) {
            arrayElementsInput[i] = sc.nextInt();
            if (arrayElementsInput[i] < 1 || arrayElementsInput[i] > 1000) {
                System.out.println("Значения должны быть от 1 до 1000.");
                return;
            }
        }

        int[] result = new int[arrayLengthInput];
        int count = 0;

        for (int i = 0; i < arrayLengthInput; i++) {
            boolean duplicate = false;
            for (int j = 0; j < count;  j++) {
                if (arrayElementsInput[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result[count] = arrayElementsInput[i];
                count++;
            }
        }
        System.out.println("Результат без дубликатов: ");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
