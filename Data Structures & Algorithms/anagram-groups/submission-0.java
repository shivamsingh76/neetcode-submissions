class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        // Map of Frequency Map as key and index in ans as value
        Map<Map<Character, Integer>, Integer> ansMap = new HashMap<>();
        Map<Character, Integer> freqMap;
        for (String str: strs) {
            freqMap = new HashMap<>();
            // create freqMap for the string
            for (char ch: str.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
            }

            if(!ansMap.containsKey(freqMap)) {
                ansMap.put(freqMap, ans.size());
                ans.add(new ArrayList<>());
            }

            ans.get(ansMap.get(freqMap)).add(str);
        }
        return ans;
    }

}
