class Solution {
    public boolean isAnagram(String s, String t) {
        int[] list = new int[26];

        String[] ss = s.split("");
        String[] tt = t.split("");

        int ns = s.length();
        int nt = t.length();
        if(nt!=ns) return false;
        int na = (int) 'a';
        for(int i = 0;i<ns;i++){
            int ws = (int)s.charAt(i)- na;
            int wt =(int) t.charAt(i)- na;
            list[ws]+=1;
            list[wt]-=1;
        }
        System.out.print(list);
        for(int i = 0;i<26;i++){
            if(list[i]!=0) return false;
        }
        return true;
}
}