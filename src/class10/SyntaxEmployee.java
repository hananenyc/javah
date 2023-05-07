package Stringclass;

public class SyntaxEmployee {
   int empid;
    int salary;
    String CEO="sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empid=123456;
        emp1.salary=50000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empid=321654;
        emp2.salary=60000;

        System.out.println(emp1.empid+" "+ emp1.salary+" "+ emp1.CEO);
        System.out.println(emp2.empid+" "+ emp2.salary+" "+ emp2.CEO);


    }

}
