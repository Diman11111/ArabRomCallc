package ArabRomCallc.ArabRomCallc;

public class ConvertArab {
    public static int convertToArabian(String roman) {
        for (int i = 0; i < Roman.romanArray.length; i++) {
            if (roman.equals(Roman.romanArray[i])) {
                return i;
            }
        }
        return -1;
    }
}
