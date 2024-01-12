package ArabRomCallc.ArabRomCallc;

public class ConvertArab {
    public static int convertToArabian(String roman) {
        for (int i = 0; i < Roman1.Roman.romanArray.length; i++) {
            if (roman.equals(Roman1.Roman.romanArray[i])) {
                return i;
            }
        }
        return -1;
    }
}
