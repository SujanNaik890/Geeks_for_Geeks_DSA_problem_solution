class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            int r=0;
            while(n>0){
                int dig=n%10;
                r=r*10+dig;
                n/=10;
            }
            if(arr[i]!=r)return false;
        }
        return true;
    }
}