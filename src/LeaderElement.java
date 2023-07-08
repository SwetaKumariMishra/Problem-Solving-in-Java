public class LeaderElement {
    public static void main(String[] args) {

        int i,j;
        int arr[] = {1,4,12,6,2,3};
        for(i=0; i<arr.length; i++)
        {
            for (j = i + 1; j<arr.length; j++)
            {
                if (arr[j]>=arr[i])
                break;

            }
            if(j== arr.length)
            {
                System.out.printf("%d is the leader element", +arr[i]);
                System.out.println();
            }
        }
    }
}
