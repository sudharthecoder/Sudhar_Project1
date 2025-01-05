
class Mobile {
    String brand;
    String modelName;
    static int price; // declaring static variable

    public void showPrice(){
        System.out.println("Brand : "+ brand + "\nModel Name : "+ modelName + "\nand the Price is : "+ price);
    }
}


public class Sample_Static {
    public static void main(String[] Args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.modelName = "IPhone14";
        Mobile.price = 60000; // initialy static variable price is assigned to 60000
        m1.showPrice();

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.modelName = "S23 Ultra";
        Mobile.price = 85000;
        m2.showPrice(); //then static variable changed to 85000

        System.out.println(Mobile.price); //now static variable value is 85000 & static variables will not change respet to the multiple objects of the classes
    }
}
