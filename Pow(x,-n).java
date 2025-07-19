class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return powPow(x, N);
    }

    public double powPow(double x, long n){
        if(n==0)return 1;
        double half=powPow(x, n/2);
        if(n%2==0){
            return half*half;
        }
        else return half*half*x;
    }
}