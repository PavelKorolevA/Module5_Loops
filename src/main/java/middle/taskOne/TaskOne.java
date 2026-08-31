package middle.taskOne;

public class TaskOne {
    public static void main(String[] args) {
        int[] massive = new int[10];
        massive[0] = 2;
        massive[1] = 3;
        massive[2] = 4;
        massive[3] = 5;
        massive[4] = 6;
        massive[5] = 7;
        massive[6] = 8;
        massive[7] = 9;
        massive[8] = 10;
        massive[9] = 11;

        int summa = 0;
        for (int i : massive) {
            summa += i;
        }
        System.out.println(summa);
    }
}
