import java.lang.Math;
import java.util.Scanner;

public class ClosestSum {
    static void printclosest(int arr[], int n, int x)
    {
        int res_l = 0, res_r = n-1;// to store indexes
        int l = 0, r = n-1, diff = Integer.MAX_VALUE;

        while (r>l)
        {
            if(Math.abs(arr[l] + arr[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] -x);
            }
             if(arr[l] + arr[r] > x)
                 r--;
             else
                 l++;
        }
        System.out.println("The closest pair is " + arr[res_l] + " and " +arr[res_r]);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter the elements in an array:");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
<<<<<<< HEAD
        int x = 20;
=======
        int x = 54;
>>>>>>> d0f8657493baf411230f4d03f05ef68046e38bed
        printclosest(arr, n, x);
    }
}
