package geekbrins.ru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число!");
        int count = 0;
        int range = 100;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Ура, вы угадали!!!");
                count++;
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше, вот вам еще одна попытка.");
            } else {
                System.out.println("Загаданное число больше, вот вам еще одна попытка.");
            }
            count++;
        }
        System.out.println("Вы угадали с "+count+" попытки.");
        scanner.close();
    }
}
