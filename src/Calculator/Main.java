package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try {
                String line = reader.readLine();
                Calculator calculation = new Calculator();

                calculation.setValue(line);
                System.out.println(calculation.getValue());

            }catch (Exception e){
                break;
            }
        }
    }
}