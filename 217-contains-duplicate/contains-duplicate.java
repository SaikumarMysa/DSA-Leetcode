class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=1;i<n;i++){
            if(i>0 &&nums[i]==nums[i-1]){
                return true;
            }
        }
        return false; 
    }
}