import java.util.Scanner;

public class Quadratic_Equation {
    public void checkEquation(int a, int b, int c)
    {
        int d=(b*b)-(4*a*c);
        if(d<0)
        {
            System.out.println("complex");
        }
        else if(d==0){
            System.out.println("Equal");
        }
        else {
            System.out.println("Real");
        }
    }

    public static void main(String[] args) {
        Quadratic_Equation q= new Quadratic_Equation();
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        System.out.println("c:");
        int c = sc.nextInt();
        q.checkEquation(a,b,c);


    }
}
