import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums){
            arr.add(num*num);
        }
        int[] result=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}