class rankSort{
    public static void main(String args[]){
        int arr[] = {85, 92, 78, 95, 88};
        int n = arr.length;
        int sorted[] = new int[n];

        for(int i = 0; i<n;i++){
            for(int j = i ; j < n; j++){
                if(arr[i] > arr[j]){
                    sorted[i] = arr[j];
                }
            }
        }

        for(int nums : sorted){
            System.out.print("["+nums+ "]");
        }
    }
}