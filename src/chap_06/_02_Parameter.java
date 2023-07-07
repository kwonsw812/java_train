package chap_06;

public class _02_Parameter {
    //method with parameter
    public static void power(int num) {
        int result = num * num;
        System.out.println(num + "의 2승은 " + result);
    }

    public static void main(String[] args){
        power(2);
    }
}
