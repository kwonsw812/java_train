package chap_06;

public class _03_Return {
    public static String PhoneNumber(){
        String number = "1234567";
        return number;
    }

    public static String Address() {
        return "Seoul";
    }
    public static void main(String[] args) {
        String phone_num = PhoneNumber();
        System.out.println(phone_num);

        String address = Address();
        System.out.println(address);
    }
}
