class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> removedDuplicatedNums = new HashSet<>();
        for (int num : nums) {
            removedDuplicatedNums.add(num);
        }
        return removedDuplicatedNums.size() != nums.length;
    }
}