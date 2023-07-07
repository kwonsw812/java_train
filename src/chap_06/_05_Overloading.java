package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    //even return value is same, different number of parameter, overload possible
    public static int getPower(int num, int exp) {
        int result = 1;

        for (int i = 0; i < exp; i++) {
            result *= num;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3, 3));
    }
}
