package DSA.Hashing;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {
    public static void main(String[] args) {

        String r="aa";
        String p="aab";

        System.out.println(canConstruct(r,p));

    }
    private static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> ransomNoteList = new ArrayList<>();
        //List<Character> magazineList = new ArrayList<>();

        for (char c : ransomNote.toCharArray()) {
            ransomNoteList.add(c);
        }
        if (ransomNoteList.contains(magazine)) {
            return true;
        }

        return false;

    }
}
