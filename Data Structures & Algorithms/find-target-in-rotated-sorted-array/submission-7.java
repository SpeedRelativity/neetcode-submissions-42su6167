class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] >= nums[left]) {
                // we are in the right sorted;
                if(nums[mid] > target && nums[left] <= target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }

            else{
                // we are in the right sorted;
                if( target <= nums[right] && target > nums[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }

        return -1;
        
    }
}
