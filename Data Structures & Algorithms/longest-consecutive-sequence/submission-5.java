class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);

        if(nums.length <=1)
            return nums.length;

        Set<Integer> numsSet = new HashSet<>();
        
        for(int num: nums) 
            numsSet.add(num);

        int max=1, count=1;

        Iterator<Integer> it = numsSet.iterator();

        while (it.hasNext()) {
            Integer num = it.next();
            count = 1;
            // check if num can be start of sequence
            if (numsSet.contains(num-1))
                continue;
            
            while(numsSet.contains(num+1)) {
                num++;
                count++;
            }

            if (count > max)
                max = count;
        }

        return max;
    }
}
