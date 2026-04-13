class Solution {
    public int characterReplacement(String s, int k) {

        // create a substring so that we created the longest same letter. 

        // sounds like a sliding window problem 

        int l = 0;
        int result = 0;
        int maxFreq = 0;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(c));
            while(r - l + 1 - maxFreq > k){
                
                freqMap.put(s.charAt(l), freqMap.get(s.charAt(l)) - 1);
                l++;
            }

            result = Math.max(result, r - l + 1);
        }
        
        return result;
        
    }
}
