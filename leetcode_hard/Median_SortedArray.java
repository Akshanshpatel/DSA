// Brute-Force Approach
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Create a new ArrayList to store elements from both arrays
        ArrayList<Integer> nums = new ArrayList<>();

        // Add elements from the first array
        for (int num : nums1) {
            nums.add(num);
        }

        // Add elements from the second array
        for (int num : nums2) {
            nums.add(num);
        }

        // Sort the ArrayList
        Collections.sort(nums);

        // Calculate the median
        int n = nums.size();
        if (n % 2 == 0) {
            // Even length: average of two middle elements
            return (nums.get(n / 2) + nums.get((n / 2) - 1)) / 2.0;
        } else {
            // Odd length: middle element
            return nums.get(n / 2);
        }
    }
}
