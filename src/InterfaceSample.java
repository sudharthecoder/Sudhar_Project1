interface IntA{
    int age =25;//interface variables are static and final so we need to initialize while declaring
    String name = "Sudhar";
    void drive();
    void swim(); //interface methods are default public
}
//since interface cannot be instantiated (not object can be created) so it doesnot have own memory in heap => so no non-final variable

class IntB implements IntA{ //while implementing you can only get methods not interface variables
    public void drive(){
        System.out.println("IntB Driving");
    }
    public void swim(){
        System.out.println("IntB swimming");
    }
}

public class InterfaceSample extends IntB { //while implementing you can only get methods not interface variables
    public static void main (String[] Args){
        IntB obj = new IntB();
        obj.drive();
        obj.swim();
        System.out.println(IntA.age);//we need not obj for accessing the interface variables as they are static. just call by "interface name.variable name"
        System.out.println(IntA.name);
    }
}
