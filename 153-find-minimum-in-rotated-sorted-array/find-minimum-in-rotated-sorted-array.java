class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        int miniElement = Integer.MAX_VALUE;;

        for(int i=0;i<n;i++){
            miniElement=Math.min(miniElement,nums[i]);
        }
        return miniElement;
    }
}