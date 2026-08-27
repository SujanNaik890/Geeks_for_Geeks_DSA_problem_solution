class Complete {
    public static ArrayList<Integer> array(int arr[][], int b[], int n) {
        // Complete the function
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        ArrayList <Integer> list=new ArrayList<>();
        list.add(sum);
        list.add(max);
        return list;
    }
}
