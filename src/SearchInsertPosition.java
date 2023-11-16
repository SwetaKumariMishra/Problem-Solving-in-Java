//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity

public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target){
        int l=0, r=nums.length-1, mid, ans=-1;

        while(l<=r)
        {
            mid = l + (r-l)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
            {
                l = mid+1;
                ans = mid+1;
            }
            else {
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {1,5,34,42,58,62,71};
        int target = 9;
        System.out.println(searchInsert(nums, target));
    }
}
