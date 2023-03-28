public class MissingAndRepeatingNumbers {
    public static void main(String[] args) {

        int arr[]={1,1,3,4,5};
        for(int i=0; i<arr.length-1; i++)
        {
                if(arr[i]==arr[i+1])
                {
                    System.out.format("The %d is repeating", +arr[i]);
                    System.out.println();
                }
            if((i+1)!=arr[i])
            {
                System.out.format("The %d is missing", +(i+1));
            }
        }

    }
}
