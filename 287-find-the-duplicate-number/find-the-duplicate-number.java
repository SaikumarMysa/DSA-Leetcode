class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int key = nums[i];
            if(hm.containsKey(key)){
                int currVal = hm.get(key);
                hm.put(key,currVal+1);
            }else{
                hm.put(key,1);
            }
        }
        for(int i:hm.keySet()){
            int val = hm.get(i);
            if(val>1){
                return i;
            }
        }
        return 0;
    }
}