/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */

public class ModifyFloyds {
    public static void main(String[] args) {
        int rows =6, num=0;
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(num % 2+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
