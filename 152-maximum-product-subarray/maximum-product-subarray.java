class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;

        int preMax = nums[0];

        int preMin = nums[0];

        int ans = nums[0];

        for(int i=1;i<n;i++){
            int currMax = Math.max(nums[i], Math.max(preMax*nums[i], preMin*nums[i]));
            int currMin = Math.min(nums[i], Math.min(preMax*nums[i], preMin*nums[i]));

            preMax = currMax;
            preMin = currMin;

            ans = Math.max(ans, preMax);
        }
        return ans;
    }
}