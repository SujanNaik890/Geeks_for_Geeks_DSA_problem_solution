class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        Arrays.sort(arr);
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==start){
                index=i;
                break;
            }
        }
        if(index==-1)return false;
        while(start<=end){
            if(arr[index]!=start){
                return false;
            }start++;
            index++;
        }
        return true;
    }
}