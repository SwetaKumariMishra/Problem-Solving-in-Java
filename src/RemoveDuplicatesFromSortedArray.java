public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicate(int nums [], int n)
    {
        int j=0;
        for(int i=0; i<n-1; i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n-1];
        return j;
    }



    public static void main(String[] args) {
        int nums [] = {1,1,2,2,3,3,4,5,6};
        int n = nums.length;

        n = removeDuplicate(nums, n);
        for (int i=0; i<n; i++){
            System.out.println(nums[i]);
        }
    }
}
