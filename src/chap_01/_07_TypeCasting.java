package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        float score_f = 93.3F;
        double score_d = 98.8;

        System.out.println((int) score_f);
        System.out.println((int) score_d);

        score = 93 + (int) 98.8;
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8;
        System.out.println(score_d); // 191.8

        double convertedScoreDouble = score; //191 -> 191.0
        // int -> long -> float -> double 자동 형변환
        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int 수동 형변환

        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

    }
}
