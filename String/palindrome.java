class palindrome{
    public static boolean isPalindrome(String s){
        int right = s.length()-1;
        int left = 0;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public static void main(String args[]){
        String s = "abcba";

        if(isPalindrome(s)){
            System.out.println(s+" is Palindrome");
        }else{
            System.out.println(s+" is not Palindrome");           
        }
    }
}