class Solution {
    int findSum(int[] arr) {
        // code here
    HashSet <Integer> set=new HashSet<>();
    for(int i:arr){
        set.add(i);
    }
    int sum=0;
    for(int i:set){
        sum+=i;
    }
    return sum;
    }
}