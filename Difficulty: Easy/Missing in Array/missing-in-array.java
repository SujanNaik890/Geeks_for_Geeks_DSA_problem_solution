class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int i=0;
        while(i<arr.length)
        {   if(arr[i]!=i+1)return i+1;
            if(i==arr.length-1 || arr[i+1]!=i+2)return i+2;

        i++;
        }
        return 0;
    }
}