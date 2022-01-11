package geekbrins.ru;



import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        for (int range=10; range<=30; range +=10) {
            System.out.println("Угадайте число!");
            int count = outputCounr(range);
            System.out.println("Вы угадали с " + count + " попытки.");
        }

    }
    private static int outputCounr (int ranger){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = (int) (Math.random() * ranger);
        while (true) {
            System.out.println("Угадайте число от 0 до " + ranger);
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
        return count;
    }

}
