package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //length of string
        System.out.println(s.length());

        //Capitalize
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함관계
        System.out.println(s.contains("Java"));

        //position
        System.out.println(s.indexOf("Java")); //index of string starts with 0
        System.out.println(s.indexOf("C#")); // Doesn't contain, return -1
        System.out.println(s.indexOf("and")); //처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막 위치 정보
        System.out.println(s.startsWith("I like")); // starts with this string, return true
        System.out.println(s.endsWith(".")); //ends with this string, return false

    }
}
