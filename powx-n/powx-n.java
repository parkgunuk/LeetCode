class Solution {
    public double myPow(double x, int n) {
        if(n < 0) return 1/getPow(x, -n);
        else return getPow(x, n);
    }
    
    public double getPow(double x, int n){
        if(n == 0) return 1;
        
        double evenRes = getPow(x, n/2);
        if(n%2 == 0) {
            return evenRes*evenRes;
        }
        else {
            return evenRes*evenRes*x;
        }
    }
}