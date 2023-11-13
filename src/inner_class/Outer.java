package inner_class;

public class Outer {
    int instanceFilels;
    static int staticField;

    class Inner { // 인스턴스 멤버 클래스
        Inner() { // 생성자

        }

        int field; // 인스턴스 필드

        void method() { // 인스턴스 메소드
            System.out.println("내부 클래스의 메서드 호출");
        }
    }

    static class StaticInner { // static(정적)클레스
        int field; // 인스턴스 필드

        void method() { // 인스턴스 메소드
            System.out.println("내부 클래스의 메서드 호출");
//            Inner inner = new Inner();
//            inner.method();
//            StaticInner.field2 = 0;
        }
    }
}
