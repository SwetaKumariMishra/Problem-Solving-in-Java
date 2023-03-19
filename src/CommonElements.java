//Write a java program to find the common elements between two arrays of integers
public class CommonElements {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,3,5,9,10};

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<b.length; j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }

    }
}
