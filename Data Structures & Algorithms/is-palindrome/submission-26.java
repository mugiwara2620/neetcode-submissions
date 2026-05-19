class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r=s.length()-1;
        if(s.trim().equals("")) return true;
        while (l<=r ){
            
            while(l<r && !isAlphaNumeric(s.charAt(l))){
                    l++;
            }
            while(l<r && !isAlphaNumeric(s.charAt(r))){
                    r--;
            }
            
            System.out.println(" l: " + s.charAt(l));
            System.out.println(" r: "+s.charAt(r));
            if (s.toLowerCase().charAt(l)!= s.toLowerCase().charAt(r)) return false;
            else {
                l++;
                r--;
            }
        }
        return true;
    }
    public boolean isAlphaNumeric(char c) {
        int acii = (int) c;
        return c!=' ' && ((acii>=97 && acii<=122) || (acii<=90 && acii>=65) || (acii<=57 && acii>=48) );
    }
}
