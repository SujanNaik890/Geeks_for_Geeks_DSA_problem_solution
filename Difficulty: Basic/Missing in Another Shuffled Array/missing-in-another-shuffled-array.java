class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        // code here
       
        int sum1=0,sum2=0;
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum2+=arr2[i];
        }
        return sum1-sum2;
    }
}