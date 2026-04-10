class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }
    HashMap<Character, Integer> map = new HashMap<>();
    for(char c: s.toCharArray()){
        map.put(c, map.getOrDefault(c,0)+1);
    }
    HashMap<Character, Integer> map2 = new HashMap<>();
    for(char c2: t.toCharArray()){
        map2.put(c2, map2.getOrDefault(c2,0)+1);
    }

    return map.equals(map2);
    

    }
}
