import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        boolean isMatching = false;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store:");
        n = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements you want to search:");
        int x = scan.nextInt();

        for (int i=0; i< arr.length; i++)
        {
            if(arr[i]==x)
            {
                isMatching = true;
                System.out.println("Element " +x+ " is present at index " +i);
            }
        }
        if(!isMatching)
        {
            System.out.println("Element is not present");
        }
    }
}
