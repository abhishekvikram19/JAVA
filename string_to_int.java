public class string_to_int {
    public static int convertStringToInt(String input){
        if(input.length() == 1){
            return input.charAt(0) - '0';
        }
        int smallOutput = convertStringToInt(input.substring(0, input.length()-1));
        int lastDigit = input.charAt(input.length()-1) - '0';
        return smallOutput*10 + lastDigit;

    }
}