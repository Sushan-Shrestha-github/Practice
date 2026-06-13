class prod{
    public static void main(String args[]){
        int arr[] = {2, 3, 4};
        int n = arr.length;
        int prod = 1;
        for(int i = 0; i<n; i++){
            prod = prod*arr[i];
        }
        System.out.println(prod);
    }
}