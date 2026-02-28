class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] traverse=new int[row][col];
        int l=0;
        for(int i=0;i<row;i++) {
            int k=row-1;
            for(int j=0;j<col;j++) {
                traverse[i][j]=matrix[k--][l];
            }
            l++;
        }
        for(int i=0;i<row;i++) 
            for(int j=0;j<col;j++)
                matrix[i][j]=traverse[i][j];
    }
}
