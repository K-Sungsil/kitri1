package class_basic;

public class SingletonExecute {
    public static void main(String[] args) {
        //기본적으로 객체 생성하는 방법
        // new = 생성자를 이용한 방법
//        new Singleton();
//        new Singleton();
//        new Singleton();

        // new를 못쓰게 해주어야 한다.
        // 생성자를 접근하지 못하도록 해야하한다
        // 그럼 어떻게 생서자 접근을 막을 수 있을까?
        // ==> private 으로 생성자 접근을 제한한다.

        // 인스턴스 필드에 접근하는 방법
        // 객체를 생성(new)해서 접근해야한다
        // ==>  static 으로 선언해야한다

        Singleton singleton = Singleton.getsingleton;

    }
}
