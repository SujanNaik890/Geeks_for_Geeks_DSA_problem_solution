class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            if(arr[i]!=arr[j])
                return false;;
        }
        return true;
    }
}
