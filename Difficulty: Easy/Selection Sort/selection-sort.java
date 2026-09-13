class Solution {
    void selectionSort(int[] arr) {
        // code here
        Arrays.sort(arr);
        int[] count=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int pass=arr[i];
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[j]>pass){
                    count[j]=count[j]+1;
                }
                else if(arr[j]<=pass){
                    count[i]=count[i]+1;
                }
            }
        }
        int[] S =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            S[count[i]]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=S[i];
        }
    }
}