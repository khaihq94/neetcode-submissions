class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<Integer> looped = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            if (looped.isEmpty() || (!looped.isEmpty() && !looped.contains(i))) {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (isAnagram(strs[i], strs[j])) {
                        group.add(strs[j]);
                        looped.add(j);
                    }
                }
                result.add(group);
            }
        }
        return result;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
