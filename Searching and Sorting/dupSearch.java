class dupSearch{
    public static void main(String args[]){
        int arr[] = {12, 15, 12, 18, 12, 20};
        int target = 12;
        int count = 0;

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(count);
    }
}