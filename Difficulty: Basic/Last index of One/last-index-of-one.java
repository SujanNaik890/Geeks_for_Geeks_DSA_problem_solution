class Solution {
    public int lastIndex(String str) {
        // code here
        String reversed = new StringBuilder(str).reverse().toString();
        for(int i=0;i<reversed.length();i++){
            if(reversed.charAt(i)=='1')
                return reversed.length()-i-1;
        }
        return -1;
    }
}