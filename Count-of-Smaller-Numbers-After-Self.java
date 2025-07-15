class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int index[]=new int[nums.length];
        int counts[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)index[i]=i;

        mergeSort(nums, index, counts, 0, nums.length-1);

        List<Integer> list=new ArrayList<>();
        for(int c : counts){
            list.add(c);
        }
        return list;
    }

    private void mergeSort(int[] nums, int[] index, int[] counts, int low, int high){
        if(low>=high) return;

        int mid=(low+high)/2;
        mergeSort(nums,index, counts, low, mid);
        mergeSort(nums,index, counts, mid+1, high);

        int left=low, right=mid+1, count=0, i=0;
        int[] temp=new int[high-low+1];
        while(left<=mid && right<=high){
            if(nums[index[right]]<nums[index[left]]){
                count++;
                temp[i++]=index[right++];
            }
            else {
                counts[index[left]]+=count;
                temp[i++]=index[left++];
            }
        }    
        while(left<=mid){
            counts[index[left]]+=count;
                temp[i++]=index[left++];
        }    
        while(right<=high){
            temp[i++]=index[right++];
        }

        for(int k=0; k<temp.length; k++){
            index[k+low]=temp[k];
        }
    }
}