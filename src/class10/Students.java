package Stringclass;

public class Students {
    String name;
    int id ;
    static int numberofstudent;

    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="hanane";
        s1.id=123;
        s1.numberofstudent++;

        Students s2=new Students();
        s2.name="Sami";
        s2.id=456;
        s2.numberofstudent++;

        Students s3=new Students();
        s1.name="zara";
        s1.id=789;
        s1.numberofstudent++;
        System.out.println(numberofstudent);


    }

}
