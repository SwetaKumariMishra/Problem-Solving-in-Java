// How do you reverse an array in place in Java//

public class Reverse {

    public static void main(String[] args)
    {
      int arr[]= {1, 2, 3, 4, 5};

      System.out.println("The original array:");
      for(int i=0; i<arr.length; i++)
      {
          System.out.print(arr[i] +" ");
      }
      System.out.println(" ");
      System.out.println("The reverse array:");
      for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
