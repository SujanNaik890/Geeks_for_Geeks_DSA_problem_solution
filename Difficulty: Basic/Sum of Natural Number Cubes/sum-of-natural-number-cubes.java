class Solution {
    int sumOfSeries(int n) {
        // code here
       int sum=0,i=1;
       while(i<=n){
           sum=sum+i*i*i;
           i++;
       }
       return sum;
    }
}