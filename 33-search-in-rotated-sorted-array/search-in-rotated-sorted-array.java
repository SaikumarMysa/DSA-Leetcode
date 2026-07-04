class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        int n = nums.length;

        for(int i=1;i<n;i++){
            if(nums[i-1]==target){
                return i-1;
            }
            if(nums[i]>nums[i-1]){
                if(nums[i]==target){
                    return i;
                }
            }else{
                pivot = i;
                break;
            }
        }

        for(int i=pivot; i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
    return -1;
    }
}