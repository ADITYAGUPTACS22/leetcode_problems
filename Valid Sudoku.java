class Solution {
    public boolean isValidSudoku(char[][] board) {
        return validSudoku(board , 0, 0 );
    }

    public boolean validSudoku(char[][] board ,int row, int col){
        if(row ==board.length)return true;

        int nrow = 0; 
        int ncol = 0;
      
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }else{
            nrow = row+1;
            ncol =0;
        }

        if(board[row][col] != '.'){
            if(isvalid(board , row, col, board[row][col])){
                if(validSudoku(board ,nrow ,ncol)) return true;
            }
        }else{
            return validSudoku(board ,nrow ,ncol);
        }

        return false;
    }

    public boolean isvalid(char[][] board, int row ,int col , char number){
  
        for(int i =0;i<board.length; i++){
   
            if(board[i][col] == number &&  i != row)return false;


            if(board[row][i] == number && i!=col)return false;
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3; 
        for(int i =sr ; i<sr+3 ; i++){
            for(int j =sc ; j<sc+3; j++){
                
                if(board[i][j] == number && (i != row || j != col)) return false;  
            }
        }
        return true;
    }
}
