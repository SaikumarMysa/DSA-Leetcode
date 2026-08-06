class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();

        if (s.length() < 10) {
            return ans;
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String curr = s.substring(i, i + 10);

            int freq = map.getOrDefault(curr, 0) + 1;
            map.put(curr, freq);

            // Add only when it is seen for the second time
            if (freq == 2) {
                ans.add(curr);
            }
        }

        return ans;
    }
}