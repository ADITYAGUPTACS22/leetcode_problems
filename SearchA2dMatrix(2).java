import java.util.*;


class SearchA2dMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        result(arr, target);
    }

    public static boolean result(int [][]matrix,int target){
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int cols = matrix[0].length;
        
    
        int row = 0;
        int col = cols - 1;
        
        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true; 
            } else if (matrix[row][col] > target) {
                col--; 
            } else {
               row++; 
            }
        }
        
        return false;
    }
}
