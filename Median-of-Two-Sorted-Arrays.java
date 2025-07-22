class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int l1=nums1.length;
       int l2=nums2.length;
       int temp[]=new int[l1+l2];
       int i=0, j=0, k=0;
       while(i<l1 &&j<l2){
        if(nums1[i]<nums2[j]){
            temp[k++]=nums1[i++];
        }
        else{
            temp[k++]=nums2[j++];
        }
       }
       while(i<l1){
        temp[k++]=nums1[i++];
       }
       while(j<l2){
        temp[k++]=nums2[j++];
       }
       return (l1+l2)%2==0?(temp[(l1+l2)/2]+temp[((l1+l2)/2)-1])/2.0:temp[((l1+l2)/2)];

    }
}