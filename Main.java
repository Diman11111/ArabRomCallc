package ArabRomCallc.ArabRomCallc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа без пробелов (например 3+3 или Х-III)");
        String expression = scanner.nextLine();
            String result = Parse.parse(expression);
            System.out.println("Результат: " + result);
        }
    }














