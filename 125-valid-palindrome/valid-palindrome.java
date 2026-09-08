class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String ans = "";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                continue;
            }
            if(ch>='0'&&ch<='9'||ch>='a'&&ch<='z'){
                ans+=ch;
            }
        }
        int n=ans.length();
       for(int i=0; i<n; i++){
        if(ans.charAt(i)!=ans.charAt(n-i-1)){
            return false;
        }
       }
        return true;
    }
}