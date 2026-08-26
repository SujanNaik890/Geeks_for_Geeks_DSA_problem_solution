class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even=0,odd=0;
        int[] count=new int[2];
        for(int i:arr){
            if(i % 2==0)
                even++;
            else
                odd++;
        }
        count[0]=odd;
        count[1]=even;
        return count;
    }
}