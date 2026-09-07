class Solution {
    public long[] findElements(long arr[]) {
        // code here
        long[] nums=new long[arr.length-2];
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}