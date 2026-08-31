package hard.one;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int inputNumber = sc.nextInt();

        int[] arr = new int[inputNumber];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < inputNumber; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i =0; i < inputNumber; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
