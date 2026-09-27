class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();//pat
        int n=s2.length();//txt

        if(n<m){
            return false;
        }

        int[] pattern = new int[26];
        for(int i=0; i<m; i++){
            pattern[s1.charAt(i)-'a']++;
        }
        //calculate first window
        int l=0,r=m;
        int[] window = new int[26];
        for(int i=0; i<m; i++){
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(pattern, window)){
            return true;
        }

        while(r<n){
            //remove the occurence of the element leaving from the window
            window[s2.charAt(l)-'a']--;
            l++;//removed the element 
            //add the occurence of the elemnt entering the window
            window[s2.charAt(r)-'a']++;
            //check they are equl
            if(Arrays.equals(pattern,window)){
                return true;
            }
            r++;
        }
        return false;
    }
}