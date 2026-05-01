class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map1 = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] cht = strs[i].toCharArray();
            Arrays.sort(cht);
            String ch = new String(cht);
            if(map1.containsKey(ch)){
                map1.get(ch).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map1.put(ch,list);
            }
        }
                System.out.println(map1.size());

                List<List<String>> list = new ArrayList<>();

for (List<String> st:map1.values()) {
            list.add(st);
        }        return list;
    }
}