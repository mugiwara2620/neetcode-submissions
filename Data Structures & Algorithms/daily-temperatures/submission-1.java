class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int current = temperatures[i];
            int j=i+1;
            int c= i;
            System.out.println(current);
            while (j<temperatures.length) {
                    if( current<temperatures[j]) {
                        c = j;
                        break;
                    }
                    j++;
            }
            results[i]=c-i;
        }
        return results;
    }
}
