package javajungsuk3.ch06;

class Ex6_3 {
    public static void main(String args[]) {
        System.out.println("Card.width = " + Card.width); // Card.width 객체 생성없이 사용가능
        System.out.println("Card.height = " + Card.height); // Card.height 객체 생성없이 사용가능

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}

class Card {
    String kind; // 무늬
    int number; // 숫자
    
    static int width = 100; // 폭
    static int height = 250; // 높이
}