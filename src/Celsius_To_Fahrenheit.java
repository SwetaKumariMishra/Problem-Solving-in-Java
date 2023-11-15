import java.util.Scanner;

public class Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        float Fahrenheit;
//        Celsius=13;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Celsius:");
        float Celsius = sc.nextFloat();

        Fahrenheit = ((9*Celsius)/5)+32;
        System.out.println("Temperature in Fahrenheit is:"+Fahrenheit);
    }
}
