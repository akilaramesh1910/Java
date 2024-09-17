public class StringToInteger {
    public static void main(String[] args) {
        String s = " -042";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        s = s.trim();

        if(s.isEmpty()){
            return 0;
        }

        int i = 0;
        int sign = 1;
        int result = 0;

        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if( result > (Integer.MAX_VALUE - digit) / 10 ){
               return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }
}
