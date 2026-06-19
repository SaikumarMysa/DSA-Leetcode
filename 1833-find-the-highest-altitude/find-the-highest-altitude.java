class Solution {
    public int largestAltitude(int[] gain) {

    int n= gain.length;
    
    int px[]=new int[n];

    int max = 0;

    px[0] = gain[0];

    for(int i=1;i<px.length;i++){
        px[i] = px[i-1] + gain[i];
    }

    for(int val:px){
         max = Math.max(max, val);
    }
    
   return max;
}

}