class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int low = 0, high=n-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[low]<=nums[mid]){
                //i.e left side is sorted
                //what if target lies in b.w low to mid?
                if(target>=nums[low]&&target<nums[mid]){
                    //ignoring the right half
                    high=mid-1;
                }else{
                    //if target is not in left half it must be somewhre after mid, so ignoring the left half
                    low=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}