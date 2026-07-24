class Solution {
    boolean isPalindrome(String s) {
        // code here
          s = s.replace(" ","");

        String rev = new StringBuilder(s).reverse().toString();

         return s.equals(rev);
    }
}