class Solution {
    public int trap(int[] height) {

        int left = 0, right = height.length - 1;
        int totalWater = 0;

        int leftMax = height[left], rightMax = height[right];

        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                totalWater += Math.max(leftMax - height[left], 0);
            }

            else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                totalWater += Math.max(rightMax - height[right], 0);
            }

        }

        return totalWater;

        
        
    }
}
