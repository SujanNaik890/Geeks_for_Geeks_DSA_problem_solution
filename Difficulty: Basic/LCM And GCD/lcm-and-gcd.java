class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int r;
        int a1=a,b1=b;
        int[] arr=new int[2];
        while(b>0){
            r=a%b;
            a=b;
            b=r;
        }
        arr[1]=a;
        arr[0]=(a1*b1)/a;
        
        return arr;
    }
}