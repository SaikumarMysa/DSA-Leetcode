class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        int n = nums.length;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }else{
                pivot=i;
                break;
            }
        }
        int l=0, h=pivot-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]>target){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        int low=pivot, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
           
    return -1;
    }
}