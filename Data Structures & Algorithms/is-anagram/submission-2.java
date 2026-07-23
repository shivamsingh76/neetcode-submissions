class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char ch: s.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

    

        for (char ch : sMap.keySet()) {
            if (!sMap.get(ch).equals(tMap.get(ch)))
                return false;
        }

        return true;
    }
}
