//Given an integer array arr[] of size N, find the maximum of the minimums for every window size in the given array.

import java.util.Scanner;

public class MaxOfMin {
    static void printMaxOfMin(int arr[], int n)
    {
        for (int k=1; k<=n; k++)
        {
            int maxOfMin = Integer.MIN_VALUE;
            for (int j=0; j<=n-k; j++)
            {
                int min = arr[j];
                for (int l=1; l< k; l++)
                {
                    if (arr[j+l] < min)
                        min = arr[j+l];
                }
                if (min > maxOfMin)
                    maxOfMin = min;
            }

            System.out.print(maxOfMin + " ");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter the elements in the array:");
        for (int i=0; i<=n-1; i++)
        {
            arr[i] = sc.nextInt();
        }

        printMaxOfMin(arr, n);
    }
}
