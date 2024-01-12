package ArabRomCallc.ArabRomCallc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа без пробелов (например 3+3 или Х-III)");
        String expression = scanner.nextLine();

        try {
            String result = Parse.parse(expression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Не коректный ввод данных");
        }
    }
}













