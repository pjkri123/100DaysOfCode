class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int c1,c2,c3;
        c1=c2=c3=0;
        for(int n:nums) 
            if(n==0) c1++;
            else if(n==1) c2++;
            else c3++;
        
        for(int j=0;j<c1;j++) nums[i++]=0;
        for(int j=0;j<c2;j++) nums[i++]=1;
        for(int j=0;j<c3;j++) nums[i++]=2;
    }
}
