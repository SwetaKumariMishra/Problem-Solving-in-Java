//Find the previous smaller element for each array element

import java.util.Scanner;

public class PreviousSmallerElement {
    static void smallerElement(int arr[], int n)
    {
        if (arr.length == 0 || arr == null)
        {
            return;
        }

        for (int j=0; j<n; j++)
        {
            int prev = -1;
            for (int k=j-1; k>=0; k--)
            {
                if (arr[k] < arr[j]) {
                    prev = arr[k];
                    break;
                }
            }
            System.out.print(prev +" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter the elements of an array:");

        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        smallerElement(arr, n);
    }
}
