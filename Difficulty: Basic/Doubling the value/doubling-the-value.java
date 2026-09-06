class Solution {
    public int solve(int b, List<Integer> arr) {
        // code here
        for(int i=0 ;i<arr.size();i++){
            if(arr.get(i)==b)b+=b;
        }
        return b;
        
    }
}