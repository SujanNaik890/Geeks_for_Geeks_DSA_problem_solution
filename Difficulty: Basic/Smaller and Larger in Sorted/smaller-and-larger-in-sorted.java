class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int small=0,great=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target)
                small++;
            if(arr[i]>=target)
                great++;
        }
        int[] nums=new int[2];
        nums[0]=small;
        nums[1]=great;
        return nums;
    }
}