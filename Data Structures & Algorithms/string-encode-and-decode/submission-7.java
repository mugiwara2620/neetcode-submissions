class Solution {
        public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        int n = strs.size();
        if(n==0) return "";
        sb.append(n);
        sb.append(",");
        for (int i = 0; i < n; i++) {
            sb.append(strs.get(i).length());
            sb.append(",");
        }
        for (int i = 0; i < n; i++) {
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();
        int n = Integer.parseInt(str.split(",")[0]);
        System.out.println(n);
        int i=0;
        int c=0;
        char com = ',';
        int[] arr =new int[n+1];
        StringBuilder num =new StringBuilder();
        while(c<=n){
            if(str.charAt(i)==com){
                arr[c]=Integer.valueOf(num.toString());
                num = new StringBuilder();
                c++;
            }else{
                num.append(str.charAt(i));
            }
            i++;
        }
        String w =str.substring(i);
        System.out.println("w: " +w);
        System.out.println("i: "+i);
        System.out.println("arr: "+Arrays.toString(arr));
        List<String> list = new ArrayList<>();
        int a = 0;
        for (int wl :Arrays.copyOfRange(arr,1,arr.length)) {
            String substring = w.substring(a, a + wl);
            list.add(substring);
            a=a+wl;
        }
        return list;
    }
}
