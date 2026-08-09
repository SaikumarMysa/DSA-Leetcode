class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String my="";
        for(int i=0; i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                my=""+strs[i];
            }
        }
       int x=my.length();
       while(x>0){
        boolean match = false;
        for(int i=0; i<strs.length;i++){
            String str = strs[i].substring(0,x);
            if(str.equals(my.substring(0,x))){
                match=true;
            }else{
                match=false;
                break;
            }
        }
        if(!match){
            x--;
        }else{
            return my.substring(0,x);
        }
       }
       return "";
    }
}