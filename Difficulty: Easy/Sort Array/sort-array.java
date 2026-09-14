class Solution {
    void sortArr(int[] arr) {
        // code here
    quicksort(arr,0,arr.length-1);
    }
    static int pivotIndex(int[] arr,int low ,int high){
            int pivot=arr[high];
            int i=low -1;
            for(int j=low ;j<high;j++){
                if(arr[j]<pivot){
                    i++;
                    //swap(arr,i,j);
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }

            // swap(arr,i+1,high);
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
           return i+1;
       }
       static void quicksort(int[] arr,int low ,int high){
           if(low<high){
           int pivot=pivotIndex(arr,low ,high);
           quicksort(arr,low ,pivot-1);
           quicksort(arr,pivot+1,high);
           }
       }
}
