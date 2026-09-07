class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            if(arr[i]<arr[i-1]+arr[i-2]){
                return arr[i-1]+arr[i-2]+arr[i];
            }
        }
        return -1;
    }
}