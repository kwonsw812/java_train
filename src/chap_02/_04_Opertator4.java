package chap_02;

public class _04_Opertator4 {
    public static void main(String[] args) {
        //논리연산자
        boolean kimchi = true;
        boolean egg = true;
        boolean folk = true;

        System.out.println(kimchi || egg || folk);
        System.out.println(kimchi && egg && folk);

        System.out.println((5 > 3) && (3 > 1));
//        System.out.println(5 > 3 > 1); 불가능한 코드

        //논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5==5));
    }
}
