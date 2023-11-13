package Interface;

public class MyClass {
    // 필드
//    RemoteControl rc = new SmartTelevision();
    RemoteControl rc;

    // 생성자
    MyClass(RemoteControl rc) {
        this.rc = rc;
    }
    // 메서드
    void  methoA(){
        RemoteControl rc = new Audio();
    }

    void methoB(RemoteControl rc) {

    }

}
