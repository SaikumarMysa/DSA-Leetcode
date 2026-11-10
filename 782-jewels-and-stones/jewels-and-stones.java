class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char st = stones.charAt(i);
            hm.put(st,hm.getOrDefault(st,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char jewel=jewels.charAt(i);
            if(hm.containsKey(jewel)){
                count+=hm.get(jewel);
            }
        }
        return count;
    }
}