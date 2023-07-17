import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[10];
        System.out.println("Enter the elements in an array:");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<n; j++)
        {
            int next = -1;
            for (int k=j+1; k<n; k++)
            {
                if (arr[j] < arr[k])
                {
                    next = arr[k];
                    break;
                }
            }
            System.out.println(arr[j] + "-->" +next);
        }
        }
    }
