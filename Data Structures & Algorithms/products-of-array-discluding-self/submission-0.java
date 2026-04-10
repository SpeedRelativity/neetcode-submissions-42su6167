class Solution {
    public int[] productExceptSelf(int[] nums) {

        // could I not just multiply all diidey by the current number?
        int[] output = new int[nums.length];
        int j = 0;
        while(j < nums.length){
            int sum = 1;
            for(int i = 0; i < nums.length; i++){
                
                if(i != j){
                    sum = sum * nums[i];
                }
            }
            output[j] = sum;
            j++;
        }
        
        return output;
   
    }
}  
