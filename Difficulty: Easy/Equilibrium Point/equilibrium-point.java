class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
         int total=0;

        for(int num:arr)
            total+=num;

        int left=0;

        for(int i=0;i<arr.length;i++){

            total-=arr[i];

            if(left==total){

                return i;

            }

            left+=arr[i];

        }
        return -1;
    }
}
