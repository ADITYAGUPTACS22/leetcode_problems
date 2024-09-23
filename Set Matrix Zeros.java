class Solution {
    public void setZeroes(int[][] matrix) {
        int Row[]= new int[matrix.length];
        int col[]= new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            Row[i]=0;
        }
        for(int i=0;i<matrix[0].length;i++){
            col[i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    Row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<Row.length;i++){
            for(int j=0;j<col.length;j++){
                if(Row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
