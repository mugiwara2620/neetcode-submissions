class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer,Integer> index = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(target-numbers[i], numbers[i]);
            index.put(numbers[i],i+1);
        }
        for(int rest: numbers){
            if(map.keySet().contains(rest)){
                int index1 =index.get(rest);
                int index2 = index.get(target-rest);
                if(index.get(rest) > index.get(target-rest)){
                    index1 = index.get(target-rest);
                    index2 = index.get(rest);
                }
                return new int[]{index1,index2};
            }
        }
        return new int[2];
    }
}
