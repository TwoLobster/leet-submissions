class Solution {
        private static int binomialCoefficient(int n, int k) {
        int i=1, result=1;
        while(i<=k){
            result = result * (n - i + 1) / i;
            i++;
        }
        return result;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> mainlist=new ArrayList<>();
        for(int j, i=0; i<numRows;  i++){
            List <Integer> inlist=new ArrayList<>();
            for(j=0; j<=i; j++){
                if(j==0 || j==i)inlist.add(1);
                else{
                    inlist.add(binomialCoefficient(i, j));
                }
            }
            mainlist.add(inlist);
        }
        return mainlist;
    }
}