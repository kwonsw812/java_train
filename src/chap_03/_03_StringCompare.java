package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //compare string

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // If same, return true else return false
        System.out.println(s2.equals("python")); // Capital can be reason of returning false

        System.out.println(s2.equalsIgnoreCase("python")); //ignore capital cases. just check the content

        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //compares content
        System.out.println(s1 == s2); //true //compares reference

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false

    }
}
