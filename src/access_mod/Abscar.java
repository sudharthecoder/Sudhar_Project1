package access_mod;

 abstract class car {
    public void playMusic(){
        System.out.println("Music is playing");
    }

    abstract public void drive();
}

abstract class nexcar extends car {
    public void drive() {
        System.out.println("Abs car Driving");
    }
    abstract public void fly();
}

public class Abscar extends nexcar {
     public void fly(){
         System.out.println("nex car Flying");
     }
     public static void main (String[] Args){
         Abscar abs = new Abscar();
         abs.drive();
         abs.playMusic();
         abs.fly();
     }
 }

