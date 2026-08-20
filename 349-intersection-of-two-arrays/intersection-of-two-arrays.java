class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            hs1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            hs2.add(nums2[i]);
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(int element:hs1){
            if(hs2.contains(element)){
                al.add(element);
            }
        }

        int arr[] = new int[al.size()];

        for(int i=0; i<al.size(); i++){
            arr[i] =  al.get(i);
        }
    return arr;
    }
}