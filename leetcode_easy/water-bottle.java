class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int temp=numBottles;
        int newBottle=0,remainingBottle=0;
        while(temp>=numExchange){
            newBottle+=temp/numExchange;
            remainingBottle=temp%numExchange;
            temp= (temp / numExchange) + remainingBottle;
        }
        return numBottles+newBottle;
    }
}