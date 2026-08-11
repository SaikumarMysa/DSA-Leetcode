class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        int n=s.length();
        for(int i=0;i<s.length()-1;i++){
            String str1 = s.substring(i+1,n);
            String str2 = s.substring(0,i+1);
            String updated = str1+""+str2;
            if(updated.equals(goal)){
                return true;
            }
        }
        return false;
    }
}