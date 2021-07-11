import java.util.Arrays;
import java.util.Scanner;

public class StringTask2 {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();

            SortingUtil.insertSortChar(chars1);
            SortingUtil.insertSortChar(chars2);
            return Arrays.equals(chars1, chars2);
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

