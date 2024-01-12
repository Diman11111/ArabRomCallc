package ArabRomCallc.ArabRomCallc;

import ArabRomCallc.ArabRomCallc.Calc;
import ArabRomCallc.ArabRomCallc.ConvertArab;
import ArabRomCallc.ArabRomCallc.ConvertRom;
import ArabRomCallc.ArabRomCallc.Detect;

public class Parse {
    public static String parse(String expression) throws Exception {
        int num1;
        int num2;
        String oper;
        boolean isRoman;

        String[] operands = expression.split("[+\\-*/]");
        if (operands.length != 2) throw new Exception("Должно быть два операнда");

        oper = Detect.detectOperation(expression);
        if (oper == null) throw new Exception("Неверная математическая операция");

        if (Roman1.Roman.isRoman(operands[0]) && Roman1.Roman.isRoman(operands[1])) {
            num1 = ConvertArab.convertToArabian(operands[0]);
            num2 = ConvertArab.convertToArabian(operands[1]);
            isRoman = true;
        } else if (!Roman1.Roman.isRoman(operands[0]) && !Roman1.Roman.isRoman(operands[1])) {
            num1 = Integer.parseInt(operands[0]);
            num2 = Integer.parseInt(operands[1]);
            isRoman = false;
        } else {
            throw new Exception("Операнды должны быть одного типа");
        }

        int result = Calc.calc(num1, num2, oper);

        if (isRoman) {
            return ConvertRom.convertToRoman(result);
        } else {
            return String.valueOf(result);
        }
    }
}
