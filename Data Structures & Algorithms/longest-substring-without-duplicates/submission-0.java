class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();

       char[] array = s.toCharArray();

       int i=0;
        int start = 0;
        int max = 0;
       
       while (i < array.length) {
        if (!set.contains(array[i])) {
            set.add(array[i]);
        }
        else {
            while (array[start] != array[i]) {
                set.remove(array[start]);
                start++;
            }

            // now array[start] == array[i];
            // set.remove(array[start]);
            start++;
        }

        if((i-start+1) > max)
            max = i-start+1;

        i++;
       } 

       return max;
    }
}
