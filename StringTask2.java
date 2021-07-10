import java.util.Scanner;

public class StringTask2 {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char [] ch1 = new char[s1.length()];
            char [] ch2 = new char[s1.length()];
            for (int i = 0; i < s1.length(); i++) {
                ch1[i] = s1.charAt(i);
                ch2[i] = s2.charAt(i);
            }
            InsertionSortingChar.insertSort(ch1);
            InsertionSortingChar.insertSort(ch2);
            for (int i = 0; i < s1.length(); i++) {
                if (ch1[i] != ch2[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean res = isAnagram(a, b);
        System.out.println((res) ? "Anagrams" : "Not Anagrams");
    }

}

