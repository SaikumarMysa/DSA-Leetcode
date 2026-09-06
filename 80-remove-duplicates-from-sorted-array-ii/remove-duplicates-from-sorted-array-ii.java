class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int x=1;
       
       
        for(int i=1;i<n;i++){
             
            if(x<2||nums[i]!=nums[x-2]){
            
                        nums[x++]=nums[i];
            }
        }
    return x;
    }
    }