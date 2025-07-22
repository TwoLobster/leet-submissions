class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
        int index=0;
        for(int i: nums){
            if(i<pivot)arr[index++]=i;
        }
        for(int j: nums){
            if(j==pivot)arr[index++]=j;
        }
        for(int k: nums){
            if(k>pivot)arr[index++]=k;
        }
        return arr;
    }
}