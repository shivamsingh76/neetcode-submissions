class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i=0; i<n ; i++) {
            int j=i+1, k=n-1;

            while (j<k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList(List.of(nums[i], nums[j], nums[k]));

                        triplet.sort(null);

                        if(!ans.contains(triplet))
                            ans.add(triplet);

                        j++;
                    }
                else if (nums[i] + nums[j] + nums[k] < 0)
                    j++;
                else 
                    k--;
            }
        }

        return ans;
    }
}
