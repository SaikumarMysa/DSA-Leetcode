class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=0;
        int n=nums.length;//5
        int x=0;
        while(r<n){//0<5
            if(nums[r]!=0){//0!=0,1!=0,0!=0,3>0
                nums[l]=nums[r];//[1]->[1,3]
                x++;
                l++;//0->1->2
                r++;//2->3--4
            }else{
                r++;//2->3
            }
            
        }
        for(int i=x;i<n;i++){
            nums[i]=0;
        }
    }
}