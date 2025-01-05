import access_mod.A;
class Box{
    int length;
    int breadth;
    int height;

    Box(int l, int b, int h){
        this.length = l;
        this.breadth = b;
        this.height = h;

        int volume = length * breadth * height;
        System.out.println("Volume is "+ volume);
    }

    boolean isequal(Box b){
        return length == b.length && breadth == b.breadth && height == b.height;
    }

    Box doubleBox(){
        Box temp = new Box(2*length, 2*breadth, 2*height);
        return temp ;
    }
}
public class Class1 {

    public static void main (String[] args){
//        System.out.println("Hello Sudharson");
//        System.out.println("Welcome to the World of Java Programming World");
//        int i=1;
//        while(i<=10){
//            System.out.println(i + " Welcome");
//            i++;
//        }
        Box BlackBox = new Box(5,2,3);
        Box B1 = new Box(6,2,3);
        if(BlackBox.isequal(B1)) {
            System.out.println("Both objects " + BlackBox + "& " + B1 + " is equal");
        }
        else
            System.out.println("Both objects " + BlackBox + "& " + B1 + " is not equal");

        Box B2 = B1.doubleBox();//doubleBox() method to double the objects arguements
        System.out.print(B2.length);

    }
}
