class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] nums=new int[grid.length*grid.length];
        int[] ans = new int[2];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                nums[grid[i][j]-1]++;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>1) ans[0]=i+1;
            if(nums[i]==0) ans[1]=i+1;
        }
        return ans;
    }
}
