class Solution {
    public int[] sortArray(int[] nums) {
    mergeSort(nums, 0, nums.length-1);
    return nums;
    }

    private void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid=(high+low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        int[] temp=new int[high-low+1];
        
        int left=low, right=mid+1, i=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right])temp[i++]=arr[left++];
            else temp[i++]=arr[right++];
        }

        while(left<=mid)temp[i++]=arr[left++];
        while(right<=high)temp[i++]=arr[right++];

        for(i=0; i<temp.length; i++){
            arr[low+i]=temp[i];
        }
    }
}