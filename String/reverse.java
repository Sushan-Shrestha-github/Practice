class reverse{
    public static String reverseString(String s){
        int right = s.length()-1;
        int left = 0;

        StringBuilder res = new StringBuilder(s);

        while(left < right){
            char temp = s.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }

        return res.toString();
    }

    public static void main(String args[]){
        String s = "SUSHAN";

        System.out.println(reverseString(s));
    }
}