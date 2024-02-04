int sumIndicesWithKSetBits(int* nums, int numsSize, int k){
int sum=0;
    for(int i=0; i<numsSize; i++)
    {
        int count=0, temp;
        temp=i;
        while(temp)
        {
            count+=temp&1;
         temp>>=1;
        }
        if(k==count)
           {
               sum+=nums[i];
           }
    }
           return sum;
}