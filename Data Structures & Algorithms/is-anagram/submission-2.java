class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int n = s.length();
        int[] chatacterCount = new int[26];
        for(int i =0; i<n; i++){
            int j = (int) s.charAt(i)-97;
            chatacterCount[j]+=1;
            int k = (int) t.charAt(i)-97;
            chatacterCount[k]-=1;
            // if(map1.containsKey(cs)){
            //     int num1 =  map1.get(cs);
            //     map1.put(cs,num1+1);
            // }else{
            //     map1.put(cs,1);
            // }
            // if(map2.containsKey(ct)){
            //     int num2 =  map2.get(ct);
            //     map2.put(ct,num2+1);
            // }else{
            //     map2.put(ct,1);
            // }
        }
        // System.out.println(map1);
        // System.out.println(map2);


        // for(Character chara : map1.keySet()){
        //     if(!map2.keySet().contains(chara) || map1.get(chara)!=map2.get(chara)){
        //         return false;
        //     }
        // }
        System.out.print(Arrays.toString(chatacterCount));
        if(Arrays.equals(chatacterCount,new int[26])) return true;
        return false;
    }
}
