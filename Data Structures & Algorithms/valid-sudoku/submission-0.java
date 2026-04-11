class Solution {
    public boolean isValidSudoku(char[][] board) {

       
        for(int i = 0; i < board.length; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < board[0].length;j++){
                if(set.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                else{
                set.add(board[i][j]);
                }
            }
            
        }

        for(int i = 0; i < board.length; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < board[0].length;j++){
                if(set.contains(board[j][i]) && board[j][i] != '.'){
                    return false;
                }
                else{
                    set.add(board[j][i]);
                }
            }
            
        }


        for(int box = 0; box < 9; box++){
            int boxRow = box / 3, boxCol = box % 3; // 1/3 = 0,1%3 = 1

            HashSet<Character> set = new HashSet<>();

            for(int i = boxRow * 3; i < boxRow * 3 + 3; i++){
                for(int j = boxCol * 3; j < boxCol * 3 + 3; j++){
                    if(board[i][j] == '.') continue;
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
        }
        

    return true;


    }
        
}
