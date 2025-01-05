import java.io.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            String a = S[0];
            String b = S[1];

            GFGLastDigit ob = new GFGLastDigit();
            System.out.println(ob.getLastDigit(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

public class GFGLastDigit {
    static int getLastDigit(String a, String b) {
        //type casting a and b from string to int
        int base = Integer.parseInt(a);
        int pow = Integer.parseInt(b);
        int result = 1;
        int lastDigit = 1;
        for(int i=1;i<=pow;i++){
            result = base * result;
        }
        lastDigit = result % 10;
        return lastDigit;

    }
};