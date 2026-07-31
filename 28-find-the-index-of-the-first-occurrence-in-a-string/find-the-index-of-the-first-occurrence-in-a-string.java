class Solution {
    //Build the LPS
    public static int[] buildLPS(String pattern){
        int m=pattern.length();
        int[] lps = new int[m];
        int len=0;
        int i=1;
        while(i<m){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static int strStr(String haystack, String needle) {
        int ans=-1;
        int n=haystack.length();
        int m=needle.length();
        int[]lps=buildLPS(needle);
        int i=0,j=0;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return (i-j);
                //j=lps[j-1];
            }else if(i<n&&haystack.charAt(i)!=needle.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return ans;
    }
}