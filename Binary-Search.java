class Solution {
    public int search(int[] nums, int target) {
     int index=binarySearch(nums, 0, nums.length-1, target);
     return index;
    }

    public int binarySearch(int[] nums, int start, int end, int target){
        if(start>end)return -1;
        int mid=start+(end-start)/2;
        int index=-1;
        if (target==nums[mid])return mid;
        else if(target<nums[mid])index=binarySearch(nums, start, mid-1, target);
        else index=binarySearch(nums, mid+1, end, target);
        return index;
    }
}