class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int k = n/3;

        List<Integer> ll = new ArrayList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                int currVal = hm.get(nums[i]);
                hm.put(nums[i], currVal+1);
            }else{
                hm.put(nums[i],1);
            }
        }

        for(int key: hm.keySet()){
            int freq = hm.get(key);
            if(freq>k){
                ll.add(key);
            }
        }

    return ll;    
    }
}