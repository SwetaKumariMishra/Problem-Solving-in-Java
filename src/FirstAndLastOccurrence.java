import javax.swing.*;
import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static int first(int arr[], int x, int n)
    {
        int low = 0, high = n-1, result = -1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;

            else if (arr[mid] < x)
                low = mid + 1;

            else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

    public static int last(int arr[], int x, int n)
    {
        int low = 0, high = n-1, result = -1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] < x)
                 low = mid+1;

            else if(arr[mid] > x)
                high = mid -1;

            else {
                result = mid;
                low = mid +1;

            }
        }
        return result;
    }
    public static void main(String[] args) {
          int arr[] = {1,2,2,2,2,3,4,7,8,8};
          int n = arr.length;
          int x = 2;
        System.out.println("First occurrence:" +first(arr, x, n));
        System.out.println("Last occurrence:" +last(arr, x, n));
    }
}
