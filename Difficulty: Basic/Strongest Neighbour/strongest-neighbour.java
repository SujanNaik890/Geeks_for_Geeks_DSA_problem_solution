class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            list.add(Math.max(arr[i],arr[i+1]));
        }
        
        return list;
    }
}