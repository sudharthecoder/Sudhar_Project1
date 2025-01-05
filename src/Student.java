public class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n){
        rollno =r;
        name = n;
    }

    void displayInformation(){
        System.out.println("The Roll no is "+ rollno + " and the Name is "+ name);
    }
    public static void main (String Args[]){
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.insertRecord(101,"Ram");
        obj2.insertRecord(102,"som");
        obj1.displayInformation();
        obj2.displayInformation();

    }
}
