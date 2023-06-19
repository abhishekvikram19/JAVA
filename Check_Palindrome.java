public class Check_Palindrome {
    public static boolean solve(String str, int start, int end) {
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return solve(str, start+1, end-1);

    }

    public static boolean isStringPalindrome(String input) {
        return solve(input, 0, input.length()-1);


    }
}
