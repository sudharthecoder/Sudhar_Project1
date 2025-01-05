import java.util.Scanner;

public class Hackerrank_str_2 {
    public static void main (String[] Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(s.substring(start,end));
    }
}
