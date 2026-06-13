class rollSearch{
    public static void main(String args[]){
        int arr[] = {101, 105, 110, 115, 120};
        int target = 110;
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid  = low + (high - low )/2;

            if(arr[mid] == target){
                System.out.println("Found at Index : " +mid);
                break;
            }else if(arr[mid] > target){
                low = mid+1;
            }else if(arr[mid] < target){
                high = mid-1;
            }else{
                System.out.println("Not found.");
                break;
            }
        }
    }
}