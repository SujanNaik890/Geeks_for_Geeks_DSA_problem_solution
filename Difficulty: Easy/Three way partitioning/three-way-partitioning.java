class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int[] num=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<a)num[j++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=a && arr[i]<b)num[j++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=b)num[j++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=num[i];
        }
    }
}