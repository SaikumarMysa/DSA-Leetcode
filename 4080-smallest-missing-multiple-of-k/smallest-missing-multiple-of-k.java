class Solution {
    public int missingMultiple(int[] nums, int k) {
      int n=nums.length;
      int ans = 0;
      
     for(int i=k; i<=(n+1)*k; i+=k){
        boolean notFound = true;
        for(int j=0; j<n; j++){
            if(i==nums[j]){//
                notFound=false;
                break;
            }
        }
        if(notFound){
            ans=i;
            break;
        }
     }
     return ans;
}
}