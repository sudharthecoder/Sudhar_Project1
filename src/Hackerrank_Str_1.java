import java.util.Scanner;

public class Hackerrank_Str_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        //To find the length of sum of the both the strings
        int len = A.length() + B.length();
        System.out.println(len);

        // To compare both the strings lexicographically
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        //Change the First letter to uppercase and concatenate two strings
        String C1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String C2 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(C1 +" "+ C2);

    }
}
