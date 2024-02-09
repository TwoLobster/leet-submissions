class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k; i++ ){
            int sums=0;
            for(int j=i; j<i+k && j<nums.length; j++){
                sums=sums+nums[j];
            }
            maxavg=Math.max(maxavg, (double)sums/k);
        }
        return maxavg;
    }
}