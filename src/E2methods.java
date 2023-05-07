package Stringclass;

public class E2methods {
    public static void main(String[] args) {
        String sent1="this is sentence i want to reverse";
        StringBuilder sen2=new StringBuilder(sent1);
   sen2.reverse();
   sent1=sen2.toString();
        System.out.println(sen2);
    }
}
