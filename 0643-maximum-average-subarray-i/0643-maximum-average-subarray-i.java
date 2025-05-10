class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        double maxSum = windowSum;


        for (int i = k; i< nums.length; i++){
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum / k;
     }
}