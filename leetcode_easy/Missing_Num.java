// Brute Force
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int arraySum=0;
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        for(int num:nums){
            arraySum+=num;
        }
        return totalSum-arraySum;
    }
}
// Optimised
class Solution {
public int missingNumber(int[] nums) {  
    	int i=0;
    	while(i<nums.length) {
    		int correct = nums[i];
    		if(nums[i]<nums.length && nums[i]!= nums[correct]) {
    			int temp=nums[i];
    			nums[i]=nums[correct];
    			nums[correct]=temp;
    		}		
    		else {i++;}
    	}
    
    for(int j=0;j<nums.length;j++) {
    	if(nums[j]!=j) {return j;}
    }
    return nums.length;
}
}
