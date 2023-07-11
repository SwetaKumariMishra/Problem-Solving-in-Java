import java.util.Arrays;
public class TwoArraysEqualNot {
    public static boolean areEqual(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }
    public static void main(String[] args) {

        int arr1[] = {1, 2, 4, 0, 5};
        int arr2[] = {2, 4, 5, 0, 1};

        if (areEqual(arr1, arr2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}