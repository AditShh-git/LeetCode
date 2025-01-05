package Arrays;

import java.util.HashSet;
import java.util.Set;

public class GCDofStrings {
    public static void main(String[] args) {
        String s="ABCABC";
        String s1="ABC";
        String se = se(s, s1);
        System.out.println(se);
    }
    private static String se(String str1,String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd = gcdg(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
    private static int gcdg(int a, int b) {
        return b == 0 ? a : gcdg(b, a % b);
    }
}
