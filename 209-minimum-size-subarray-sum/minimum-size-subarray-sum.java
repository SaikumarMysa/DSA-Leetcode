class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n= nums.length;

        int left = 0;

        int minLen = Integer.MAX_VALUE;
        
        int sum = 0;

        for(int right=0;right<n;right++){
          
            //expand 
            sum+=nums[right];
             
            //check condition and shrink when condition fails
            while(sum>=target){
                int windowLen = right - left + 1;

                minLen = Math.min(minLen, windowLen);

                sum = sum - nums[left];
                
                left++;
            }
           
        }
        if(minLen!=Integer.MAX_VALUE){
            return minLen;
        }

        return 0;
    }


}