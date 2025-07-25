class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=leftSearch(nums, target);
        int right=rightSearch(nums, target);
        int [] arr=new int[2];
        arr[0]=left;
        arr[1]=right;
        return arr;
    }
    public int leftSearch(int nums[], int target){
        int start=0, end=nums.length-1, left=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                left=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return left;
    }

    public int rightSearch(int[] nums, int target){
        int start=0, end=nums.length-1, right=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                right=mid;
                start=mid+1;
            }else if(nums[mid]>target)end=mid-1;
            else start=mid+1;
        }
        return right;
    }
}