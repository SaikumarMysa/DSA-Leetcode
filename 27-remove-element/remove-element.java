class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int l=0,r=0;
        int c=0;
        while(r<n){
            if(nums[r]!=val){
               int temp=nums[l];
               nums[l]=nums[r];
               nums[r]=temp;
                l++;
                c++;
            }
            r++;
        }
        return c;
    }
}