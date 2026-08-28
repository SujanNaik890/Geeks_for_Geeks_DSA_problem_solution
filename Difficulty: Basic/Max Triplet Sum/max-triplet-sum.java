class Solution {
    public int maxTripletSum(List<Integer> arr) {
        // Code Here
        Collections.sort(arr);
        
        return arr.get(arr.size()-1)+arr.get(arr.size()-2)+arr.get(arr.size()-3);
    }
}
