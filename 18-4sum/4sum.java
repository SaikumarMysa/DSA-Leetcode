class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int x=0; x<=n-4; x++){
            if(x>0 && nums[x]==nums[x-1]) continue;
            for(int i=x+1; i<=n-3; i++){
                if(i>x+1 && nums[i]==nums[i-1]) continue;
                int left = i+1;
                int right = n-1;
                while(left<right){
                    long sum = (long) nums[x]+nums[i]+nums[left]+nums[right];
                    if(sum==target){
                        list.add(Arrays.asList(nums[x], nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        
                        while(left<right){
                            if(nums[left]==nums[left-1]){
                                left++;
                            }else{
                                break;
                            }
                            }
                        while(left<right){
                            if(nums[right]==nums[right+1]){
                                right--;
                            }else{
                                break;
                            }
                        }
                       
                    }else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
               
            }
        }
        return list;
    }
}