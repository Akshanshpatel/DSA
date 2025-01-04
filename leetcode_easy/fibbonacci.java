class Solution {
    public int fib(int n) {
        int firstnum=0,secondnum=1;
        int count=n;
        int nextnum=0;
        while(count>0){
            nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
            count--;
        }
        return firstnum;
    }
}