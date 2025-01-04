// Tribbo solution
class Solution {
    public int tribonacci(int n) {
        int firstnum=0,secondnum=1,thirdnum=1;
        while(n>0){
            int nextnum=firstnum+secondnum+thirdnum;
            firstnum=secondnum;
            secondnum=thirdnum;
            thirdnum=nextnum;
            n--;
        }
        return firstnum;
    }
}