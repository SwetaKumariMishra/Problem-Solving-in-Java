/*Q.This is a Floyds Triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14
-------------91
 */

public class FloydsTriangle {
    public static void main(String[] args) {
        int rows=13, k=1;
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}
