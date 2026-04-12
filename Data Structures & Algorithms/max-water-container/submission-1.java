class Solution {
    public int maxArea(int[] heights) {

        int left = 0, right = heights.length - 1;
        int totalWater = 0;
        while(left < right){
            int width = right - left;
            int water = Math.min(heights[left], heights[right]) * width;
            totalWater = Math.max(totalWater, water);

            if(left < right && heights[left] < heights[right]){
                left++;
            }
            else if(left < right && heights[right] < heights[left]){
                right--;
            }
            else{
                left++;
            }
        }

        return totalWater;
    }
}
