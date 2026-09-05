class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=1,r=0;
        while(r<n){
            if(nums[l-1]!=nums[r]){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}