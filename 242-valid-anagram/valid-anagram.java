class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char key=s.charAt(i);
            if(hm1.containsKey(key)){
                hm1.put(key,hm1.get(key)+1);
            }else{
                hm1.put(key,1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char key=t.charAt(i);
            if(hm2.containsKey(key)){
                hm2.put(key,hm2.get(key)+1);
            }else{
                hm2.put(key,1);
            }
        }
        return hm1.equals(hm2);

    }
}