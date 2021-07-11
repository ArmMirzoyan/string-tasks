import java.util.Arrays;

public class StringUtil {
    private StringUtil() {

    }

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

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);

    }
}

