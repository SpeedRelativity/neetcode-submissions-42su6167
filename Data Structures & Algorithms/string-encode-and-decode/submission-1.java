class Solution {

    public String encode(List<String> strs) {

        int length;
        char delimeter = '#';
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            ans.append(strs.get(i).length()).append(delimeter).append(strs.get(i));
        }

        return ans.toString();
        

    }

    // 5#Hello6#World!

    public List<String> decode(String str) {
        
      List<String> output = new ArrayList<>();

      int i = 0;

      while( i < str.length()) {
        int j = i;
        while(str.charAt(j) != '#'){
            j++;
        }

        int len = Integer.parseInt(str.substring(i,j));
        i = j + 1;
        output.add(str.substring(i, i + len));

        i = i + len;
      }

        return output;
    }
}
