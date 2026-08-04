class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean visited[]= new boolean[26];
        for(int i=0; i<sentence.length();i++){
            char ch = Character.toLowerCase(sentence.charAt(i));
            if(ch>='a'&&ch<='z'&&!visited[ch-'a']){
                visited[ch-'a']=true;
            }
        }
        for(int i=0; i<visited.length; i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
}