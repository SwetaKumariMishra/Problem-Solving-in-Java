//Java Program to Rotate all odd numbers right and all even numbers left in an array of 1 to N
import java.util.Arrays;

public class RotateNumbersOddEven {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8};
        System.out.println("Left rotate even numbers are:");
        //for (int i = 0; i <arr.length; i++) {
        //if (arr[i] % 2 == 0) {
        int first=arr[0];
        for (int i = 0; i <arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
        System.out.println(Arrays.toString(arr));

        int arr1[] = {1,3,5,7};
        System.out.println("Right rotate odd numbers are:");
        //for (int i = 0; i <arr.length; i++) {
        //if (arr[i] % 2 == 0) {
        int last=arr1[arr1.length-1];
        for (int j =arr1.length-1; j>0; j--) {
            arr1[j] = arr1[j-1];
        }
        arr1[arr1.length-4] = last;
        System.out.println(Arrays.toString(arr1));
            }
        }

