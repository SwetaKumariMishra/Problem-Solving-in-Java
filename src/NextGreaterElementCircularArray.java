//Find the next greater element for every element in a circular array
import java.util.Scanner;

public class NextGreaterElementCircularArray {
    static void findNextGreater(int a[], int n) {
        int arr[] = new int[2 * n];

        for (int j = 0; j < 2*n; j++)
            arr[j] = a[j % n];

        for (int j = 0; j < n; j++) {
            int next = -1;
            for (int k = j + 1; k < 2*n; k++) {
                if (arr[j] < arr[k]) {
                    next = arr[k];
                    break;
                }
            }
            System.out.println(next);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter the elements in an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findNextGreater(arr, n);
    }
}

