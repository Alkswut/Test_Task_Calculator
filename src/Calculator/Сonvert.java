package Calculator;

public class Сonvert {
    private String inputStr;
    private String[] elements;

    private String[] numbersR = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
            "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
            "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
            "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    private String[] numbersA = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public void setInputLine(String str) {
        inputStr = str;
    }

    public String[] splitElements() throws Exception {
        try {
            elements = inputStr.split("\\s++");
            if (elements.length != 3)
                throw new Exception("throws Exception // т.к. строка содержит более или менее трех чисел");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return elements;
    }

    public void checkValues(String str1, String str2) {
        char a = str1.charAt(0);
        char b = str2.charAt(0);
        try {
            if (Character.isLetter(a) && Character.isDigit(b) || Character.isLetter(b) && Character.isDigit(a))
                throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public String getOperation(String[] array) {
        return array[1];
    }

    public int convertNumber(String str) {
        int result = 0;
        char a = str.charAt(0);
        try {
            if (Character.isLetter(a)) {
                for (int i = 0; i < numbersR.length; i++) {
                    if (numbersR[i].equals(str)) {
                        result = i;
                    }
                }
            } else {
                for (int i = 0; i < numbersA.length; i++) {
                    if (Integer.parseInt(str) == i) {
                        result = i;
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return result;
    }




    public String findNumber(String str) {
        String res;
        for (int i = 0; i < numbersR.length; i++) {
            if (str.equals(String.valueOf(i))) {
                return res = numbersR[i];
            }
        }
        return res = null;
    }
}