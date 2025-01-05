public class PatternPrint {
    public static void main(String[] Args){
        int i,j,k;
        String string = "*";
        for(i=1;i<=3;i++) {
            for(j=i; j<=3-i; j++){
                System.out.print(" ");
            }
            for (k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*

*
i=1;i<=3;i++

j=2; j>=0; j--

k=i;k<=1;k++
 */