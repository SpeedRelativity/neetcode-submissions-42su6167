class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> set1 = new HashMap<>();
        for(char c: s1.toCharArray()){
            set1.put(c, set1.getOrDefault(c, 0) + 1);

        }

        int l = 0, r = s1.length();
        HashMap<Character, Integer> set2 = new HashMap<>();
        while(r <= s2.length()){            
            for(char c: s2.substring(l,r).toCharArray()){
                set2.put(c, set2.getOrDefault(c, 0) + 1);
            }
            if(set1.equals(set2)){
                return true;
            }
            set2.clear();
            r++;
            l++;
        }

        return false;


        
    }
}
