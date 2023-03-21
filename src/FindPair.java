import java.util.Scanner;

public class FindPair {
    public static void main(String[] args) {
        int num1[]={8,7,2,5,3,1};
        boolean isPairFound = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number:");
        int target = sc.nextInt();

        for(int i=0; i< num1.length-1; i++)
        {
            for(int j=i+1; j< num1.length; j++)
            {
                if (num1[i]+num1[j] == target) {
                    isPairFound = true;
                    System.out.printf("Pair found(%d, %d)",  num1[i], num1[j]);
                    System.out.println(" ");
                }
            }
        }
        if(!isPairFound)
            System.out.println("Pair not found");
    }
}
