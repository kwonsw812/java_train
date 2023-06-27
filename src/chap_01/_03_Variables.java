package chap_01;

public class _03_Variables {
    public static void main(String[] args){
        String name = "kwon";
        int time = 15;

        System.out.println("name is " + name +", time is " + time);

        double score = 90.5;
        char grade = 'A';

        System.out.println(name + "'s score is " + score + ", grade is " + grade);

        boolean pass = true;
        System.out.println("pass? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;

        System.out.println(d);
        System.out.println(f);

        long l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
