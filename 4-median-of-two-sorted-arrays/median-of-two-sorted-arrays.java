class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m+n];
        int k = merged.length;

        int l=0;
        int r=0;
        int x=0;
        while(l<m){
            merged[x++] = nums1[l++];
        }
        while(r<n){
            merged[x++] = nums2[r++];
        }
        Arrays.sort(merged);

       int left = 0;
       int right = k-1;

       if(k%2!=0){
        int med = (left+right)/2;
        return merged[med];
       }else{
        int idx1 = (left+right)/2;
        int idx2 = idx1+1;
        double med = (merged[idx1]+merged[idx2])/2.0;
        return med;
       }


    }
}