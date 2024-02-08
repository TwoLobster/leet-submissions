class Solution {
    public static long binCof(int n, int k){
        long result=1;
        int i=1;
        while(i<=k){
            result=result * (n-i)/i;
            i++;
        }
        return result;
}
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List <Integer> list=new ArrayList<>();
        for(int i=0; i<rowIndex; i++){
            if(i==0 || i==rowIndex-1)list.add(1);
            else{
                list.add((int)binCof(rowIndex, i));
            }
        }
        return list;
    }
}