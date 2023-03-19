//How do you find the duplicate number on a given integer array//

public class duplicate {
    public static void main(String[] args)
    {
        int[] arr= {2, 3, 6, 4, 1, 4, 7};
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate Element is:"+arr[j]);
                }
            }
        }
    }
}
