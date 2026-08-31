package middle.taskFive;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число размера массива: ");
        int N = sc.nextInt();
        int[][] twoDimensionArray = new int[N][N];

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                twoDimensionArray[row][col] = col + 1;
            }
        }

        int summaDiagonali = 0;

        for (int i = 0; i < N; i++) {
            summaDiagonali += twoDimensionArray[i][i];
        }

        System.out.println("Сумма элементов главной диагонали: " + summaDiagonali);
    }
}
