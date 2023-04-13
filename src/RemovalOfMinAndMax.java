//Find the array element left after alternate removal of minimum and maximum
// Java code to implement the ap
import java.util.*;

public class RemovalOfMinAndMax {

    // Function to find the element left
    static int lastRemaining(int arr[], int N)
    {
        // If single element in array
        if (N == 1)
            return arr[0];

        // Sort the array
        Arrays.sort(arr);

        // return middle element
        return arr[(N - 1) / 2];
    }
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1, 5, 4, 2 };
        int N = arr.length;

        // Function call
        System.out.print(lastRemaining(arr, N));
    }
}
