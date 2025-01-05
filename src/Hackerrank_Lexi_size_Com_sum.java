import java.util.Scanner;

public class Hackerrank_Lexi_size_Com_sum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        String smallest = "";
        String largest = "";
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for (int i = 0; i < s.length() - k+1; i++) {
            String str = s.substring(i, k + i);
            if (smallest.compareTo(str) > 0) {
                smallest = str;
            }
            if (largest.compareTo(str) < 0) {
                largest = str;
            }
        }
        System.out.println( smallest + "\n" + largest);
    }
}

