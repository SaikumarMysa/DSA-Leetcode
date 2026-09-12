class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int x=0,y=1;
        int arr[]=new int[nums.length];
        int e=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                arr[x++]=nums[i];
                e++;
            }
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2!=0){
                arr[e++]=nums[i];
            }
        }
        return arr;
    }
}