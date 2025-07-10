class Solution {
    public boolean checkPossibility(int[] nums) {
        int count=0, index=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                count++;
                index=i;
            }
        }
        if(count>1)return false;
        else if(count==1){
            if(index==0)nums[index]=nums[index+1];
            else if(nums[index-1]<=nums[index+1])nums[index]=nums[index+1];
            else nums[index+1]=nums[index];
            for(int i=0; i<nums.length-1; i++){
                if(nums[i]>nums[i+1]){
                return false;
                }
            }
        }
        return true;
    }
}