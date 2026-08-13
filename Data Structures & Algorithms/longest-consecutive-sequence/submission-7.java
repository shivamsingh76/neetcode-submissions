class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);

        if(nums.length <=1)
            return nums.length;

        int n = nums.length;
        int count=1, max=1;

        for (int i=1; i<n ; i++) {
            if (nums[i] - nums[i-1]==1)
                count++;
            else if (nums[i] - nums[i-1] == 0)
                continue;
            else {
                if (count > max) 
                    max = count;
                count = 1;
            }
        }

        if (count > max)
            max = count;

        return max;
    }
}
