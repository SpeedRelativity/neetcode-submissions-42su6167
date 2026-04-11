class Solution {
    public int[] productExceptSelf(int[] nums) {

        // could I not just multiply all diidey by the current number?
        int[] output = new int[nums.length];
        output[0] = 1;
        for(int i = 1; i < nums.length; i++){
            output[i] = output[i - 1] * nums[i-1];
        }
        // [1,1,2,6]
        int postfix = 1; // just like how we set output[0] = 1.
        for(int i = nums.length - 1; i >= 0; i--){
            output[i] = output[i] * postfix;
            postfix *= nums[i];
        }
        return output;
    }
}  
