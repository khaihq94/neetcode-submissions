class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> removedDuplicatedNums = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return removedDuplicatedNums.size() != nums.length;
    }
}