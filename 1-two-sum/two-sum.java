class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>();

        int n=nums.length;

        for(int i=0; i<n; i++){
            int want=target-nums[i];
            if(seen.containsKey(want)){
                int ind=seen.get(want);
                return new int[]{ind,i};
            }else{
                seen.put(nums[i],i);
            }
        }
        
        return new int[]{0,0};
    }
}