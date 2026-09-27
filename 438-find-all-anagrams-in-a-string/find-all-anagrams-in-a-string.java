class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al = new ArrayList<>();
        int n=s.length();
        int k=p.length();

        if(n<k){
            return al;
        }
        //forming a frequency array for the pattern
        int[] pattern = new int[26];
        for(int i=0; i<k; i++){
            pattern[p.charAt(i)-'a']++;
        }

        //forming a frequency array for the first window
        int[] window = new int[26];
        int l=0,r=k;
        for(int i=0; i<k; i++){
            window[s.charAt(i)-'a']++;
        }
        //checking equlity of arrays
        if(Arrays.equals(pattern, window)){
            al.add(l);
        }

        //slide the window
        while(r<n){
            //Removing the occurence of element leaving from window
            window[s.charAt(l)-'a']--;
              l++;
            // Adding the occurence of element coming to the window
            window[s.charAt(r)-'a']++;

          
            if(Arrays.equals(pattern, window)){
                al.add(l);
            }
               r++;
          
           
        }
        return al;
    }
}