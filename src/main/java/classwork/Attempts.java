package classwork;

import java.util.Random;
import java.util.Scanner;

public class Attempts {
    public static void main(String[] args) {
        int secretNumber = Math.abs(new Random().nextInt())%100;
        int inputNumber = -1;
        int attempts = 0;
        System.out.println("Попробуйте угадать число от 0 до 100. Введите число: ");
        while (secretNumber != inputNumber) {
            Scanner scanner = new Scanner(System.in);
            inputNumber = scanner.nextInt();
            if (inputNumber>secretNumber) {
                System.out.println("Введенное число больше загаданного");
            }
            if (inputNumber<secretNumber) {
                System.out.println("Введенное число меньше загаданного");
            }
            attempts++;
            System.out.println("Это была попытка номер: " + attempts);
        }
        System.out.println("Вы угадали число! Загаданное число: " + secretNumber);
        System.out.println("Использовано попыток: " + attempts);
    }
}