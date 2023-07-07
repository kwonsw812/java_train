package chap_05;

public class _01_Array {
    public static void main(String[] args){
        //first way
        String[] coffees = new String[4];
        //second way
        String coffee[] = new String[4];

        //initializing first way
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        //third way
        String[] coffees1 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //forth way
        String[] coffees2 = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        int[] i = new int[3];

        double[] d = new double[] {10.0, 2.1, 4.5};
        boolean[] b = {true, true, false};
    }
}
