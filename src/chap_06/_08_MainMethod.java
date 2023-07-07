package chap_06;

public class _08_MainMethod {
    public static String getHiddenData(String info, int n) {
        info = info.substring(0, n+1);
        for (int i = n+1; i < info.length(); i++) {
            info = info + "*";
        }
        return info;
    }
    public static void main(String[] args) {
        String name = "kwon";

        System.out.println(getHiddenData(name, 1));
    }
}
