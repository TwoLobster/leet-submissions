class Solution {
    public boolean check(int[] nums) {
        int k=0, count=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>=nums[i-1]);
            else{
                k=i;
                count++;
            }
        }
        if ((count==1 && nums[0]>=nums[nums.length-1]) || (count==0)) return true;
        else return false;
    }
}