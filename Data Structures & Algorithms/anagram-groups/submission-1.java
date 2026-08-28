class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = createKey(str);
            if (map.containsKey(key)) {
                map.get(key).add(str);
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(str);
            map.put(key, group);
        }
        return new ArrayList<>(map.values());
    }

    private String createKey(String s) {
        int[] key = new int[26];
        for (int i = 0; i < s.length(); i++) {
            key[s.charAt(i) - 'a']++;
        }
        return Arrays.stream(key).mapToObj(String::valueOf).collect(Collectors.joining("#"));
    }
}
