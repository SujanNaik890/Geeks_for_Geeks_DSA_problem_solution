class Solution {
    public ArrayList<Integer> xorArray(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++) 
        {
            arr[i]^=arr[i+1];
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        return list;
    }
}