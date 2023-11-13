package class_basic;

public class Singleton {
    // 싱글톤?
    // 하나의 인스턴스만 생성시켜주는 패턴
    private static  Singleton instance = new Singleton(); // 객체 생성
    public static Singleton getsingleton;

    private Singleton(){ // private 내부에선 new 생성가능

    }

    public static Singleton getInstance(){
        return instance;
    }
}
