package HashMap;

import java.util.ArrayList;
import java.util.List;

public class RamsonNote {
    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean b = conChar(ransomNote, magazine);
        System.out.println(b);

    }
    private static boolean conChar(String ransomNote, String magazine) {

        List<Character> magazineList=new ArrayList<>();


        for(char c: magazine.toCharArray()){
            magazineList.add(c);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineList.contains(c)) {
                return false;
            }
            magazineList.remove((Character) c);
        }
        return true;

    }
}
