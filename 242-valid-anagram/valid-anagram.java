class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=s.toCharArray();
        char cv[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(cv);
        return Arrays.equals(ch,cv);
    }
}