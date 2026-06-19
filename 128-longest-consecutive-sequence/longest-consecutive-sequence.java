class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int count = 1;

        int longest = count;

        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                count++;
                longest = Math.max(longest,count);
            }else if(nums[i]-nums[i-1]==0){
                continue;
            }
            else{
                count=1;
            }
        }
    return nums.length==0?0:longest;
    }
}