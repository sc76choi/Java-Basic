package ch02;

/**
 * 리터럴의 접두사와 접미사
 * 논리형 : false, true
 * 정수형 : 123, 0b01010, 007, 0xFF, 100L
 * 실수형 : 3.14, 3.0e8, 1.4f, 0x1.0p-1
 * 문자형 : 'A', '1', '/n'
 * 문자열 : "ABC", "123", "A", "true"
 */
public class VarEx3 {
    public static void main(String[] args) {
        int score = 100; // 초기화
        System.out.println(score);

        boolean power = true;
        char ch = 'A';
        int chi = 'A';
        System.out.println(chi); // 65
        
        String str = "ABC"; // 클래스
        String elev = "" + 7 + 7;
        System.out.println(elev); // 77
        String elev2 = 7 + 7 + "";
        System.out.println(elev2); // 14
        
        byte b = 127; // -128~ 127 // 128 -> Type mismatch: cannot convert from int to byte

        int hex = 0x100; // 16진수
        int i = 100; // 10진수
        int oct = 0100; // 8진수
        int bin = 0b1; // 2진수

        long l = 10_000_000_000L; // The literal {int}100000000000 of type int is out of range
        System.out.println(l);

        float f = 3.14f;
        double d = 3.14d;

        ///////////////////////////////////////////////////////////////////////////////////////////////
        // 범위가 '변수' > '리터럴' 인 경우
        int ii = 'A'; // int > char
        long ll = 123; // long > int
        double dd = 3.14f; // double < float

        // 범위가 '변수' < '리터럴' 인 경우
        // int iii = 30_0000_0000; // int의 범위(20억) 벗어남
        // long lll = 3.14f; // long < float
        // float fff = 3.14; // float < double
        // byte, short 변수에 ini 리터럴 저장가능, 단, 변수의 타입의 범위 이내여야 함

        
    }
}
