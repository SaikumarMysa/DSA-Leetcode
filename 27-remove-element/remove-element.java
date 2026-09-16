class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0,r=0,n=nums.length;
        while(r<n){
            if(nums[r]!=val){
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