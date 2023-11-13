package inner_class;

public class Execute {
    public static void main(String[] args) {
        // 인스턴스 멤버 클래스
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();

        // 정적 멤버 클래스
        Outer.staticField = 10;
        new Outer().instanceFilels = 10;
        Outer.StaticInner inner1 = new Outer.StaticInner();
    }
}
