class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            if(hm.containsKey(nums[i])){
                int currVal=hm.get(nums[i]);
                hm.put(nums[i],currVal+1);
            }else{
                 hm.put(nums[i],1);
            }
           
        }
        int max=0;
        for(int a:hm.values()){
            max=Math.max(max,a);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==max){
                return i;
            }
        }
        return 0;
    }
}