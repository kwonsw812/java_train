package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }

        //enhanced for
        for(String coffee : coffees){
            System.out.println(coffee + " 하나");
        }
    }
}
