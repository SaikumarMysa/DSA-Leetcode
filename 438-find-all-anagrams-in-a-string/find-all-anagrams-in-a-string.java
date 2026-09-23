class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al = new ArrayList<>();

        int n=s.length();

        int m=p.length();

        char[] cv= p.toCharArray();
        Arrays.sort(cv);

        for(int i=0; i<=n-m; i++){
            String str = s.substring(i,i+m);
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            if(Arrays.equals(cv,ch)){
                al.add(i);
            }

        }
        return al;
    }
}