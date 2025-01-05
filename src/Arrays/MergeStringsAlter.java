package Arrays;

public class MergeStringsAlter {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "pqrs";
        System.out.println(mergeAlternately(s1, s2));
    }

    private static String mergeAlternately(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int s1Len = s1.length(), s2Len = s2.length(), minLen = Math.min(s1Len, s2Len);
        for (int i = 0; i < minLen; i++) {
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if (s1Len > s2Len) {
            sb.append(s1.substring(minLen));
        } else if (s1Len < s2Len) {
            sb.append(s2.substring(minLen));
        }
        return sb.toString();
    }
}
