import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());

        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        capitalize(a);
        capitalize(b);
    }
    public static String capitalize(String str){
        String newString = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.print(newString + " ");
        return newString;
    }
}
