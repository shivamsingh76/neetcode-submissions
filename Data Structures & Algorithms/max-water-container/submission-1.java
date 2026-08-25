class Solution {
    public int maxArea(int[] heights) {
        int max=0, area;
        int n = heights.length;

        int i=0, j=n-1;

        while (i<j) {
            area = Math.abs(i-j)*
                    Math.min(heights[i], heights[j]);
            
            if (area > max)
                max = area;
            
            if (heights[i] < heights[j])
                i++;
            else
                j--;
            
        }

        return max;
    }
}
