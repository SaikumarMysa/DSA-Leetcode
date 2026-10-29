class Solution {
    int primeCount=0;
    public int countPrimes(int n) {
        for(int i=2; i<n; i++){
            boolean result=isPrime(i);
            if(result){
                primeCount++;
            }
        }
        return primeCount;
        
    }
    public boolean isPrime(int num){
        if(num==1) return false;
        if(num==2||num==3) return true;
        if(num%2==0||num%3==0) return false;
        for(int i=5; i*i<=num;i=i+6){
            if(num%i==0||num%(i+2)==0){
                return false;
            }
        } 
        return true;
    }
}