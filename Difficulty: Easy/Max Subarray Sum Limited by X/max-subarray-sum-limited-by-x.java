class Solution {
    public int maxSum(int[] arr, int x) {
        // code here
     int n = arr.length;
     long maxSum = 0;
     long currSum = 0;
     int left = 0;
     int right = 0;

     while(right < n) {
         currSum += arr[right];

         while(currSum > x) {
             currSum -= arr[left];
             left++;
         }

         maxSum = Math.max(maxSum, currSum);
         right++;
     }
     return (int)maxSum;
    }
}