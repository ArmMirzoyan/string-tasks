import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());

        if(a.charAt(0) > b.charAt(0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " +
                b.substring(0, 1).toUpperCase() + b.substring(1));
    }
}
