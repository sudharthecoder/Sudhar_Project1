import org.w3c.dom.ls.LSOutput;

public class This_Sample {
    String myName;

    This_Sample() //default constructor
    {
        System.out.println("Hello, This is default constructor");
    }

    void setName(String myName) //
    {
        System.out.println(myName);
        myName = myName;
        this.myName = myName;  //class variable assigned to the variable value from the main class using this denoite the class variable when both class variable and main class arguement are in same name
    }

    public static void main(String[] Args) {
        This_Sample t1 = new This_Sample();
        t1.setName("Sudhar");
        System.out.println(t1.myName);
    }
}
