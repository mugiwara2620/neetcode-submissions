class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int acii = (int) s.charAt(i);
            // System.out.print((int))
            if(s.charAt(i)!=' ' && ((acii>=65 && acii<=122) || (acii<=57 && acii>=48)) ) stringBuilder.append(s.toLowerCase().charAt(i));
        }
        StringBuilder inverse = new StringBuilder();
        int nb = stringBuilder.length();
        System.out.print(stringBuilder.toString());
        for (int i = nb - 1; i >= 0; i--) {
            inverse.append(stringBuilder.charAt(i));
        }
        return inverse.toString().contentEquals(stringBuilder);
    }
}
