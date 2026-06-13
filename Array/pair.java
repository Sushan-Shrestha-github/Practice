class pair{
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int right = arr.length-1;
        int left = 0;
        int target = 9;

        while(right>left){
            if(arr[right]+arr[left] == target){
                System.out.println("Found");
                break;
            }else if(arr[right]+arr[left] > target){
                right--;
            }else if(arr[right]+arr[left] < target){
                left++;
            }else{
                System.out.println("Not found");
                break;
            }
        }
    }
}