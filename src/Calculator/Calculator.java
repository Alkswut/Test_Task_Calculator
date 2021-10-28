package Calculator;

public class Calculator {
    private String inputStr;
    private Сonvert convert = new Сonvert();
    private Number value1 = new Number();
    private Number value2 = new Number();

    public void setValue(String str) {
        inputStr = str;
    }

    public String getValue() throws Exception {
        int a, b, tempRes = 0;
        String result = "";
        convert.setInputLine(inputStr);
        String[] array = convert.splitElements();
        convert.checkValues(array[0], array[2]);

        value1.setValue(array[0]);
        value1.setType(array[0]);

        value2.setValue(array[2]);
        value2.setType(array[2]);
        a = convert.convertNumber(value1.getValue());
        b = convert.convertNumber(value2.getValue());
        try {
            if (a == 0 || a > 10 ) throw new Exception("throws Exception //т.к. в первой переменной превышено максимальное значение");
            if (b == 0 || b > 10 ) throw new Exception("throws Exception //т.к. во второй переменной превышено максимальное значение");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        try {
            switch (convert.getOperation(array)) {
                case "+":
                    tempRes = Operations.Add(a, b);
                    break;
                case "-":
                    tempRes = Operations.Minus(a, b);
                    break;
                case "/":
                    tempRes = Operations.Divide(a, b);
                    break;
                case "*":
                    tempRes = Operations.Multiply(a, b);
                    break;
                default:
                    throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        if (value1.getType().equals("ROMAN") && value2.getType().equals("ROMAN")) {
            try {
                if (tempRes > 0) {
                    result = convert.findNumber(String.valueOf(tempRes));
                } else {
                    throw new Exception("throws Exception //т.к. в римской системе нет 0 и отрицательных чисел");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        } else {
            result = String.valueOf(tempRes);
        }
        return result;
    }
}