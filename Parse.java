package ArabRomCallc.ArabRomCallc;

public class Parse {
    public static String parse(String string) throws Exception {
        int num1;
        int num2;
        String oper;
        boolean isRoman;

        String[] operands = string.split("[+\\-*/]");
        if (operands.length != 2) throw new Exception("Не коректный ввод данных");

        oper = Detect.detectOperation(string);

        if (Roman.isRoman(operands[0]) && Roman.isRoman(operands[1])) {
            num1 = ConvertArab.convertToArabian(operands[0]);
            num2 = ConvertArab.convertToArabian(operands[1]);
            isRoman = true;
        } else if (!Roman.isRoman(operands[0]) && !Roman.isRoman(operands[1])) {
            num1 = Integer.parseInt(operands[0]);
            num2 = Integer.parseInt(operands[1]);
            isRoman = false;
        } else {
            throw new Exception("Цифры должны быть одного типа, арабские либо римские");
        }
        if (num1>10 || num2>10 )
            throw new Exception("Цыфры должны быть в пределах от 1 до 10 или от I до X");

        int result = Calc.calc(num1, num2, oper);

        if (isRoman) {
            return ConvertRom.convertToRoman(result);
        } else {
            return String.valueOf(result);
        }
    }
}
