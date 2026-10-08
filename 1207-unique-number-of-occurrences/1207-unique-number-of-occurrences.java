class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        //step-1: count occurences
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //step-2: store frequencies
        Set<Integer> set = new HashSet<>();
        for(int frequency : map.values()){
            set.add(frequency);
        }

        //step-3: check uniqueness
        return map.size() == set.size();
    }
}