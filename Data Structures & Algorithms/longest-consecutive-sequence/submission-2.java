class Solution {
    public int longestConsecutive(int[] nums) {



        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int longest = 0;
        for(int i = 0; i < nums.length; i++){
            int counter = 1;
            int prev = nums[i] - 1;
            if (set.contains(prev)){
                continue;
            } 
            else {
                
                int next = nums[i] + 1;
                while(set.contains(next)){
                    counter++;
                    next++;
                }
                longest = Math.max(longest, counter);
            }
        }

        return longest;

        
    }
}
