class Solution {
    public int removeDuplicates(int[] nums) {
        int l=1, r=1;
        int n=nums.length;
        while(r<n){
            if(l<2||nums[r]!=nums[l-2]){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}