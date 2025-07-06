class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array=new int[n+m];
        int i=0, j=0, k=0;
        while(i<m || j<n){
            if(i==m){
                array[k]=nums2[j];
                j++;
                k++;
            }
            else if(j==n){
                array[k]=nums1[i];
                i++;
                k++;
            }
            else{
                if(nums1[i]>=nums2[j]){
                    array[k]=nums2[j];
                    k++;
                    j++;
                }
                else{
                    array[k]=nums1[i];
                    i++;
                    k++;
                }
            }
        }
        i=0;
        while(i<array.length){
            nums1[i]=array[i];
            i++;
        }
    }
}