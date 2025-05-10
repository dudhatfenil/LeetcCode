class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Stores number and its index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Value needed to reach the target
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i); // Store current number with its index
        }
        
        // Problem guarantees exactly one solution, so this line won't be reached
        return new int[] {};
    }
}
