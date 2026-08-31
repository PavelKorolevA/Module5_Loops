package middle.taskTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер массива может задается значениями от 1 до 100");
        System.out.println("Введите размер массива: ");
        int N = sc.nextInt();
        if (N < 1 || N > 100) {
            System.out.println("Введено неверное значение");
            System.out.println("Введите значение от 1 до 100");
        }

        double[] massive = new double[N];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < N; i++) {
            massive[i] = sc.nextDouble();
        }

        double maxMassiveElement = massive[0];
        for (double i : massive) {
            if (Math.abs(i) > Math.abs(maxMassiveElement)) {
                maxMassiveElement = i;
            }
        }

        System.out.println("Результат: " + Math.abs(maxMassiveElement));
    }
}
