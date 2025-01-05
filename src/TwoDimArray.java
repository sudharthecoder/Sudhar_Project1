public class TwoDimArray {
    public static void main (String[] Args ){
        int[][] arr = new int[3][4];
        int trial = 0;

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                 arr[i][j] = (int)(Math.random()* 10);
                //System.out.println(arr[i][j]);
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        for(int n[] : arr){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
