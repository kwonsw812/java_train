package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5;
        boolean isSmallCar = false;
        boolean withDisabledPerson = false;

        int fee = hour * 4000;

        if (fee > 30000) fee = 30000;

        if(isSmallCar || withDisabledPerson) fee /= 2;
    }
}
