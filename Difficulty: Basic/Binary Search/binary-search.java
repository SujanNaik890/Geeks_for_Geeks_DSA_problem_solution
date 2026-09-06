class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
       for(int i:arr){
           if(i==k)return true;
       }
       return false;
    }
}