package Options;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.println("enter the first number");
        double number1 = Double.parseDouble(br.readLine());
        System.out.println("enter the secend number");
        double number2 = Double.parseDouble(br.readLine());
        double area = 2*number1 + 2*number2;

        System.out.println("Area = " + area );


    }
}
