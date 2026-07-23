class Solution {
    public boolean hasDuplicate(int[] nums) {
       Map<Integer, Integer> myMap = new HashMap<>();

       for(int i: nums) {
        if (myMap.containsKey(i))
            return true;
        myMap.put(i, 1);
       }
       return false;
    }
}