class Solution {
    public int maxStep(int[] arr) {
        // code here
        int count=0;
        int maxcount=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else count=0;
            
        }
        return maxcount;
    }
}