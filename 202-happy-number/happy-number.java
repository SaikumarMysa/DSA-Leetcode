class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(!hs.contains(n)){
            hs.add(n);
            int sum =0;
            int temp=n;
            while(temp!=0){
                int last=temp%10;
                int sqr=last*last;
                sum+=sqr;
                temp=temp/10;
            }
            n=sum;
        }
        return hs.contains(1);
    }
}