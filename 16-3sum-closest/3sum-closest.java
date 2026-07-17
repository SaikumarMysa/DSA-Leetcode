class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        int ans=-1;//eventually stores the closest sum 
        int prevDis=Integer.MAX_VALUE;

        for(int i=0; i<n-2; i++){
            int sum = 0;
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    sum=nums[i]+nums[j]+nums[k];
                    int dist = Math.abs(sum-target);

                    if(dist<prevDis){
                        ans=sum;
                        prevDis=dist;
                    }
                    
                }
            }
        }
        return ans;
    }
}