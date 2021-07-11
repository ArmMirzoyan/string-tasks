import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
//**********************************Task1********************************************
        System.out.println(a.length() + b.length());

        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(StringUtil.capitalize(a) + " " + StringUtil.capitalize(b));
//**********************************Task2********************************************
        boolean res = StringUtil.isAnagram(a, b);
        System.out.println((res) ? "Anagrams" : "Not Anagrams");

    }
}
