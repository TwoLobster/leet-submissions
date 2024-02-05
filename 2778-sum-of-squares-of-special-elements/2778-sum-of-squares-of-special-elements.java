class Solution {
    public int sumOfSquares(int[] nums) {
        int sums=0;
        for (int i=1; i<=nums.length; i++)
        {
            if(nums.length%i==0)
                sums+=Math.pow(nums[i-1], 2);
        }
        return sums;
    }
}