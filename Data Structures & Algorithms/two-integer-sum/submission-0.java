class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> memory = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            if (memory.containsKey(s)) {
                result[0] = memory.get(s);
                result[1] = i;
                break;
            } else {
                memory.put(nums[i], i);
            }
        }
        return result;
    }
}
