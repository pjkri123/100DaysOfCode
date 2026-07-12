class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int n:nums) set.add(n);
        List<Integer> list=new ArrayList<>(set);
        int max=0;
        int count=0;
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i)+1==list.get(i+1))
                count++;
            else count=0;
            if(max<count) max=count;
        }
        return list.isEmpty()?0:max+1;
    }
}
