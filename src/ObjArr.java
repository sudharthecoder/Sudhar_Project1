class Studentae {
    int rollno;
    String name;
    int marks;
}

public class ObjArr {
    public static void main(String[] Args){
        Studentae s1 = new Studentae();
        s1.rollno = 1;
        s1.name = "som";
        s1.marks = 96 ;

        Studentae s2 = new Studentae();
        s2.rollno = 2;
        s2.name = "Ram";
        s2.marks = 95 ;

        Studentae s3 = new Studentae();
        s3.rollno = 3;
        s3.name = "sam";
        s3.marks = 94 ;

        Studentae stud[] = new Studentae[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
//        for (int i=0;i<stud.length;i++) {
//            System.out.println(stud[i].name + " : " + stud[i].marks);
//        }

        for(Studentae stu : stud){
            System.out.println(stu.name +" : "+stu.marks);
        }
    }
}
