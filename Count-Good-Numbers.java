class Solution {

    static final int mod=1000000007;
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;

        long oddProd=pow(4, odd);
        long evenProd=pow(5, even);
        long result=(oddProd*evenProd) %mod;

        return (int)result;
    }

    public long pow(long base, long exp){
        if(exp==0)return 1;

        long half=pow(base, exp/2);
        long result=(half*half) %mod;
        if(exp%2==1)result=(result*base)%mod;
        return result;
    }
}