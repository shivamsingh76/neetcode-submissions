class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i: nums) 
            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
        
        List<ArrayList<Integer>> freqArray = new ArrayList<>();

        for(Map.Entry entry : freqMap.entrySet())
            freqArray.add(new ArrayList(List.of(entry.getKey(), entry.getValue())));
        
        
        Comparator<ArrayList<Integer>> freqComparator = new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                if (a.get(1) < b.get(1))
                    return 1;
                else if (a.get(1) == b.get(1) && a.get(0) < b.get(0))
                    return 1;
                else 
                    return -1;
            }
        };
        
        Collections.sort(freqArray, freqComparator);

        int[] ans = new int[k];

        for (int i=0 ; i<k ; i++)
            ans[i] = freqArray.get(i).get(0);

        return ans;
    }
}
