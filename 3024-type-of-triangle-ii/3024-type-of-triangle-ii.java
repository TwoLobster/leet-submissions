class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        if(nums[i]+nums[i+1]<=nums[i+2])return "none";
        else if(nums[i]==nums[i+1] && nums[i]==nums[i+2])return "equilateral";
        else if(nums[i]==nums[i+1] || nums[i+1]==nums[i+2])return "isosceles";
        else return "scalene";
    }
}