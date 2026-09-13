class Solution {
    public int trap(int[] height) {
        int waterTrapped=0;

        int n=height.length;

        int[] px = new int[n];

        int pmax=height[0];

        for(int i=1; i<n; i++){
           
            pmax=Math.max(pmax,height[i-1]);

            px[i]=pmax;
        }

        int[] s= new int[n];
        int x=0;
         int smax=height[n-1];
         
        for(int i=n-2;i>=0;i--){
            smax=Math.max(smax, height[i+1]);
            s[x++]=smax;
        } 
        int[] sx= new int[n];
        for(int i=0;i<s.length;i++){
            sx[i]=s[n-i-1];
        }

        for(int i=0; i<n;i++){
            int waterLevel=Math.min(px[i],sx[i]);
            int waterStored= waterLevel-height[i];
            if(waterStored>=0){
                waterTrapped+=waterStored;
            }
        }
        return waterTrapped;


    }
}