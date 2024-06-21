import java.util.*;

public class ClearDigits {
    public static String clearDigit(String str) {
        int n = str.length();
        char[] newresult = new char[n];
        int len=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                len--;
            } else {
                newresult[len++]=ch;
            }

        }
        return String.valueOf(Arrays.copyOfRange(newresult, 0, len));
       
    }

    public static void main(String[] args) {
        String str = "a5b9c";

        System.out.println(clearDigit(str));
    }
}
