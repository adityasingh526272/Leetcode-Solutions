class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //step-1: transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //swap matrix[i][j] , matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //step-2: reverse all rows of matrix
        //visit every row and reverse it
        for(int row=0;row<n;row++){
            //ab main ek nai row r aa chuka hu
            //ab reverse start krdo
            int startCol = 0;
            int endCol = n-1;
            while(startCol <= endCol){
                //swap matrix[row][startCol], matrix[row][endCol]
                int temp = matrix[row][startCol];
                matrix[row][startCol] =  matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
    }
}