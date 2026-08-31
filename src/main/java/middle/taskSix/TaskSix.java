package middle.taskSix;

import java.util.Random;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int A = new Random().nextInt(9) + 1;
            int B = new Random().nextInt(9) + 1;
            int C = A * B;

            System.out.println("Сколько будет " + A + "*" + B);

            Scanner sc = new Scanner(System.in);
            int inputResult = sc.nextInt();


            if (inputResult == C) {
                System.out.println("Ответ верный");
            } else {
                System.out.println("Ответ неверный. " + A + " * " + B + " = " + C);
            }
        }
    }
}
