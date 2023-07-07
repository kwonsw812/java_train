package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //string transform
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7)); //starts with index 7. (deletes prior string)
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); //starts from "Java", ends just before .

        //delete space
        s = "    I like Java.    ";
        System.out.println(s);
        System.out.println(s.trim());

        //concatenate string
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
