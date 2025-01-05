package BusResv;

public class Bus {
    private int busNo; //why variables private..? and methods public...? because encapsulating the data
    private boolean ac;
    private int capacity; //made all the variables of bus class as private and create get and set methods to access from the main method


    Bus(int busNo, boolean ac, int cap){
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getCap()
    { //accesor method
        return capacity;
    }

    public void setCap(int cap) //mutator method
    {
        capacity = cap;
    }
    public int getBusNo() //accesor method
    {
        return busNo;
    }                           // now setBusNo method is not written as of now

    public boolean isAc(){ //accesor method
        return ac;
    }

    public void setAc(boolean val){ //mutator method
        ac = val;
    }

    public void displayBusInfo(){
        System.out.println("Bus No is "+ busNo + " Is AC available : "+ ac + "  Total capacity is " + capacity );
    }
}
