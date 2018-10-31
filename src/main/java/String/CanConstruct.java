package String;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ints = new int[26];
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();
        for (char ch : chars2)
            ints[ch - 'a']++;
        for (char ch : chars1){
            if (--ints[ch - 'a'] < 0)
                return false;
        }
        return true;
    }
}
