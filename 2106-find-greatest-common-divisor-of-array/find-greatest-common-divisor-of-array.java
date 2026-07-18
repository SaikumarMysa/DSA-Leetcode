class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int gcd = -1;

        for(int i=0; i<nums.length; i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        for(int i=1; i<=min; i++){
            if(min%i==0 && max%i==0){
                gcd = Math.max(gcd,i);
            }
        }
    return gcd;
    }
}