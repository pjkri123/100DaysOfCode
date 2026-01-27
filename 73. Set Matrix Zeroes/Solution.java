class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> list=new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                if(matrix[i][j]==0) list.add(new int[]{i,j});

        for(int[] arr:list) {
            for(int k=0;k<matrix[0].length;k++) matrix[arr[0]][k]=0;
            for(int k=0;k<matrix.length;k++) matrix[k][arr[1]]=0;
        }
    }
}
