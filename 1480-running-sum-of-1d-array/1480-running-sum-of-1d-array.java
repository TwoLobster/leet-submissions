class Solution {
    public int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            int sums=0;
            for(int j=0; j<=i; j++)
            {
                sums+=nums[j];
            }
            result[i]=sums;
        }
        return result;
    }
}