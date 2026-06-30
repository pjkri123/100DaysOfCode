class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Solution 1
        /*
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                if(target==matrix[i][j]) return true;
        return false;
        */
        
        // Solution 2
        /*
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            int val=matrix[mid/n][mid%n];
            if(val==target) return true;
            else if(target>val) low=mid+1;
            else high=mid-1;
        }
        return false;
        */

        // Solution 3
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0) {
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) row++;
            else col--;
        }
        return false;
    }
}
