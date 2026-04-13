class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0, r = 0;
        int result = 0;
        int count = 0;

        HashSet<Character> seen = new HashSet<>();

        while(r < s.length()){
            if(!seen.contains(s.charAt(r))){
                seen.add(s.charAt(r));
                r++;
                result = Math.max(result, r - l);
                
            }
            
            else{
                while(seen.contains(s.charAt(r))){
                    seen.remove(s.charAt(l));
                    l++;
                }
            }
        }

        return result;
        
    }
}
