class lowTemp{
    public static void main(String args[]){
        int arr[] = {34, 29, 31, 27, 35, 30};
        int n = arr.length;
        int low = arr[0];

        for(int i = 0; i<n ;i++){
            if(arr[i] < low){
                low = arr[i];
            }
        }
        System.out.println(low);
    }
}