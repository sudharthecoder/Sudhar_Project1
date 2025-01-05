class A{
    int summa;
    public void Afunction(){
        System.out.println("Class A function method");
    }
    class B {
        public void function(){
            System.out.println("Class B function method");
        }
    }
    static class C{
        public void cfunction(){
            System.out.println("Class C function method");
        }
    }
}
public class innerClassDemo {
    public static void main(String[] Args ){
        A obj = new A(); //creating object for the Outer Class A
        obj.Afunction();

        A.B obj1 = obj.new B(); //creating object for the inner class B with obj of B
        obj1.function();

        A.C obj2 = new A.C(); //creating object for the static class C without obj of B
        obj2.cfunction();


    }
}
