public class CommonElementInThreeArrays {
    public static void main(String[] args) {

       int a[] = {1, 5, 10, 20, 40, 80};
       int b[] = {6, 7, 20, 80, 100} ;
       int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
        int i=0, j=0, k=0;

        boolean isCommonElement = false;
        while(i< a.length && j<b.length && k<c.length)
        {
            if (a[i] == b[j] && a[i] == c[k]) {
                System.out.println(a[i]);
                i++;
                j++;
                k++;
                isCommonElement=true;
            }
            else if (a[i] < b[j])
                i++;
            else if (b[j] < c[k])
                j++;
            else
                k++;
        }
        if(!isCommonElement) System.out.println("-1");
    }
}
