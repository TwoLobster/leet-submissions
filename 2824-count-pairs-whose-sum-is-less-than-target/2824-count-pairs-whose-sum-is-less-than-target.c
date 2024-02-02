int countPairs(int* nums, int numsSize, int target){
    int count=0, j, i;
    for(i=0; i<numsSize; i++)
{
    for(j=0; j<numsSize; j++)
    {
    if(nums[i]+nums[j]<target && i<j)
           {
               count++;
           }
    }
}
    return count;

}