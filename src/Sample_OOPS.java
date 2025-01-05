public class Sample_OOPS {
    int id ; //instance variables declaration - memory only in run time not in compile time
    String name ;

    public static void main (String[] args ){
        Sample_OOPS obj1 = new Sample_OOPS(); //new keyword for creating new memory for the object of class
        Sample_OOPS obj2 = new Sample_OOPS();
        System.out.println( "obj 1 details");
        System.out.println( obj1.id);
        System.out.println( obj1.name);
        System.out.println( "---------------------------------------------------------------");
        System.out.println( "obj 2 details");
        System.out.println( obj2.id = 2);
        System.out.println( obj2.name = "sample2");
    }
}
