package pack;

import java.util.*;

public class Sum {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number to be added:");
        x = scan.nextInt();
        System.out.println("Enter the second number to be added:");
        y = scan.nextInt();

        sum(x, y);

    }

    private static void sum(int x, int y) {
        int answer = x + y;

        System.out.println("The sum of two numbers are:" +answer);

    }
}