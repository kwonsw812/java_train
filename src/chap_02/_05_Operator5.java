package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항연산자
        //결과 = 조건 ? 참의 경우 결과 : 거짓 겅우 결과
        int x = 5;
        int y = 4;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = x < y ? x : y;
        System.out.println(min);

        String s = (x != y) ? "diff" : "corr";
    }
}
