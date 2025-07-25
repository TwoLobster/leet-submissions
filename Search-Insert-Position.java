class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public int binarySearch(int[] nums, int start, int end, int target){
        if (start>end) return start;
        int mid=start+(end-start)/2;
        if(nums[mid]==target)return mid;
        if(target<nums[mid]) return binarySearch(nums, start, mid-1, target);
        else return binarySearch(nums, mid+1, end, target);
    }
}