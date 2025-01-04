class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,rn=0;
        while(temp>0){
            int digit=temp%10;
            rn=(rn*10)+digit;
            temp=temp/10;
        }
        return x==rn;
    }
}