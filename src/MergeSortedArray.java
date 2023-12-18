public class MergeSortedArray {

    public static void mergeSorted(int nums1[], int nums2[], int m, int n)
    {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (i>=0 && j>=0)
        {
            if(nums1[i] < nums2[j])
            {
               nums1[k--] = nums2[j--];
        }
            else {
                nums1[k--] = nums1[i--];
            }
        }

        while (j>=0)
        {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,4,5};
        int m = 3;
        int n = 3;
//        int size1 = nums1.length-1;
//        int size2 = nums2.length-1;
        mergeSorted(nums1, nums2, m, n);
        System.out.println(nums1[m]);

    }
}
