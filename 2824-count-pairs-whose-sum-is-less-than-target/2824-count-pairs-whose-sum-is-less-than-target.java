class Solution {
    public int countPairs(List<Integer> nums, int target) {
            int count=0, j, i;
    for(i=0; i<nums.size(); i++)
    {
        for(j=0; j<nums.size(); j++)
        {
            if(nums.get(i)+nums.get(j)<target && i<j)
               count++;
        }
    }
    return count;

    }
}