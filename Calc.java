package ArabRomCallc.ArabRomCallc;

public class Calc {
    static int calc(int a, int b, String oper) {
        switch (oper) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
            default:
                throw new IllegalArgumentException("Неверная математическая операция");
        }
    }
}
