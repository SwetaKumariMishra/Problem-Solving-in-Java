import java.lang.Math;

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

        int arr[] = {10, 22, 28, 29, 30, 40};
        int n = arr.length;
        int x = 54;
        printclosest(arr, n, x);
    }
}
