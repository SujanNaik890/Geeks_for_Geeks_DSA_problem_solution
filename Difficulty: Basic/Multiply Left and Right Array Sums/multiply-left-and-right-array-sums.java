class Solution {
    public int multiply(int[] arr) {
        // code here
        int n=arr.length;
         int left=0;
        int right=0;
        if(n%2==0)
        {
             left=n/2;
             right=n/2;
        }
        else
        {
             left=n/2;
             right=n/2 + 1;
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<left;i++)
        {
            leftsum+=arr[i];
        }
        for(int i=left;i<n;i++)
        {
            rightsum+=arr[i];
        }
        return rightsum*leftsum;
    }
}
