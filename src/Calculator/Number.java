package Calculator;

public class Number {
    private String value;
    private String type;

    public void setValue(String input){
        value = input;
    }
    public String getValue(){
        return value;
    }

    public void setType(String str){
        char b = str.charAt(0);
        if (Character.isLetter(b)){
            type = TypeNumber.ROMAN.toString();
        }else if ((Character.isDigit(b))){
            type = TypeNumber.ARABIC.toString();
        }else type = null;
    }
    public String getType(){
        return type;
    }
}