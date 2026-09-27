class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n=s2.length();

        int m=s1.length();

        if(n<m){
            return false;
        }

        char ch[] = s1.toCharArray();//[a,b]

        Arrays.sort(ch);

        for(int i=0; i<=n-m; i++){
            String ss = s2.substring(i,i+m);
            char cv[]=ss.toCharArray();
            Arrays.sort(cv);
            if(Arrays.equals(ch,cv)){
                return true;
            }
        }
        return false;

    }
}