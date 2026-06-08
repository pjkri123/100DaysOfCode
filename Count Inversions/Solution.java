class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr,0,arr.length-1);
    }
    static int merge(int[] arr, int start, int mid, int end) {
        int count=0;
        int left=start;
        int right=mid+1;
        int k=0;
        int[] temp=new int[end-start+1];
        while(left<=mid && right<=end) {
            if(arr[left]<=arr[right]) temp[k++]=arr[left++];
            else {
                temp[k++]=arr[right++];
                count+=(mid-left+1);
            }
        }
        while(left<=mid) temp[k++]=arr[left++];
        while(right<=end) temp[k++]=arr[right++];
        for(int i=start;i<=end;i++) arr[i]=temp[i-start];
        return count;
    }
    static int mergeSort(int[] arr, int start, int end) {
        int count=0;
        if(start>=end) return count;
        int mid=start+(end-start)/2;
        count+=mergeSort(arr,start,mid);
        count+=mergeSort(arr,mid+1,end);
        count+=merge(arr,start,mid,end);
        return count;
    }
}
