import java.util.Scanner;

public class Hackerrank_Str_Token {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String regex = "[ !,?._'@]+";
        if (!sc.hasNext()){
            System.out.println(0);
            }
        else{
            String s = sc.nextLine();
            String[] outarr = s.trim().split(regex); // use trim method to remove front spaces
            System.out.println(outarr.length);//logically array length is capacity of the array not the total no.of data inserted in the array i.e., for real, array length = arr.length-1
            for (String x : outarr) {
                System.out.println(x);
            }
        }
        sc.close();
    }
}
