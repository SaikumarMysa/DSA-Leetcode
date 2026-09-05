class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int xu=1;//xu=x:index for next valid non duplicate number u:counter for unique elements
        for(int i=1; i<n;i++){
            if(nums[xu-1]!=nums[i]){
                nums[xu]=nums[i];
                xu++;
            }
        }
        return xu;
    }
}