class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        int miniElement = Integer.MAX_VALUE;;

        for(int i=0;i<n;i++){
            miniElement=Math.min(miniElement,nums[i]);
        }
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==miniElement){
                return nums[m];
            }
            if(nums[l]<=nums[m]){
                if(miniElement>=nums[l]&&miniElement<nums[m]){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }else{
                if(miniElement>nums[m]&&miniElement<=nums[h]){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
        }
        return -1;
    }
}