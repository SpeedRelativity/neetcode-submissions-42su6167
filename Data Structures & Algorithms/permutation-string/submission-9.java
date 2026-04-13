class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        HashMap<Character, Integer> set1 = new HashMap<>();
        for(char c: s1.toCharArray()){
            set1.put(c, set1.getOrDefault(c, 0) + 1);

        }

        int l = 0, r = s1.length();
        HashMap<Character, Integer> set2 = new HashMap<>();
        for(char c: s2.substring(l,r).toCharArray()){
            set2.put(c, set2.getOrDefault(c, 0) + 1);
        }

        if (set1.equals(set2)) return true;

        
        while(r <= s2.length() - 1){  
            set2.put(s2.charAt(r), set2.getOrDefault(s2.charAt(r),0) + 1);
            set2.put(s2.charAt(l), set2.getOrDefault(s2.charAt(l),0) - 1);
            if(set2.get(s2.charAt(l)) == 0){
                set2.remove(s2.charAt(l));
            }
            r++;
            l++;

            if(set1.equals(set2)){
                return true;
            }
        }

        return false;

        


        
    }
}
