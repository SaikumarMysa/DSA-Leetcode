class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int k = nums1.length;
      
      for(int i=m;i<nums1.length;i++){
        nums1[i] = nums2[k-i-1];
      }
        Arrays.sort(nums1);
    }
}