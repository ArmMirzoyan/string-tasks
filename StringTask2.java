import java.util.Scanner;

public class StringTask2 {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            int[] arr1 = new int[256];
            int[] arr2 = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                arr1[ s1.charAt(i)] += 1;
                arr2[ s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (arr1[i] != arr2[i])
                    return false;
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

