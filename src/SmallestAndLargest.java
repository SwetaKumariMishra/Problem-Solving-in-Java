// How do you find the largest and smallest number in an unsorted integer array//

public class SmallestAndLargest {

    public static void main(String[] args)
    {
        int arr[]= {2, 4, 67, 54, 43, 23, 1};
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]<min)
                {
                   min = arr[i];
                }
                if(arr[i]> max)
                {
                    max = arr[i];
                }
          }
        System.out.println("Smallest :" +min);
        System.out.println("Largest :" +max);
    }
    }