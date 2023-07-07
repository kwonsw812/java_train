package chap_02;

import java.sql.SQLOutput;

public class _02_Operator2 {
    public static void main(String[] args) {
        int num = 10;
        num = num + 2;

        //+=, -=

        num += 2;
        System.out.println(num);

        num -= 2;
        System.out.println(num);

        // += /=
        num *= 2;
        System.out.println(num);

        num /= 2;
        System.out.println(num);

        num %= 2;
        System.out.println(num);
    }
}
