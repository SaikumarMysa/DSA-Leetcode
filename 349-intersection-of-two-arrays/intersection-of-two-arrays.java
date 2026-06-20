class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> hm1 = new HashMap<>(); 
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for(int i=0;i<n1;i++){
            int key = nums1[i]; 
            if(hm1.containsKey(key)){
                int currVal = hm1.get(key);
                hm1.put(key, currVal+1);
            }else{
                hm1.put(key, 1);
            }
        }

        for(int i=0;i<n2;i++){
            int key = nums2[i]; 
            if(hm2.containsKey(key)){
                int curr = hm2.get(key);
                hm2.put(key, curr+1);
            }else{
                hm2.put(key, 1);
            }
        }

        for(int val: hm1.keySet()){
            if(hm2.containsKey(val)){
                list.add(val);
            }
        }

        int [] arr = new int [list.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
       return arr; 
    }
    
}