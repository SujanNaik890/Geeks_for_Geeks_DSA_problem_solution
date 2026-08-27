class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        ArrayList <Integer> even=new ArrayList<>();
        ArrayList <Integer> odd=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int i=0,k=0,j=0;;
        while(k<even.size()){
            arr[i++]=even.get(k++);
        }
        while(j<odd.size()){
            arr[i++]=odd.get(j++);
        }
        
    }
}