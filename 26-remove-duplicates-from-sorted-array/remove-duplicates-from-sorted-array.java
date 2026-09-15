class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=1;
        int r=1;
        while(r<n){
            if(nums[r]!=nums[l-1]){
                nums[l]=nums[r];
                l++;
                r++;
            }else{
                r++;
            }
           
        }
        return l;
    }
}