class Solution {
    public int singleNonDuplicate(int[] nums) {
    int n=nums.length;
    if(n==1) return nums[0];
    if(nums[n-1]!=nums[n-2]) return nums[n-1];
    int low=0;
    int high=low+1;

    while(low<=high){
        if(nums[low]==nums[high]){
            low+=2;
            high+=2;
        }else{
            return nums[low];
        }
    }  
    return nums[low];
    }
}