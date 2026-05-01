class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a)); // descending
        return new ArrayList<>(list.subList(0,k)).stream().mapToInt(Integer::intValue).toArray();
    }
}
