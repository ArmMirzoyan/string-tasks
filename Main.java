import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean res = StringUtil.isAnagram(a, b);
        System.out.println((res) ? "Anagrams" : "Not Anagrams");
    }
}
