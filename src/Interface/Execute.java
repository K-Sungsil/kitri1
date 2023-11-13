package Interface;

public class Execute {
    public static void main(String[] args) {
        // 인터페이스는 구현 객체가 있어야 한다
        // 부모 객체 = 자식 객체
        // 인터페이스 = 구현 객체
        // 다형성

        RemoteControl rc = new SmartTelevision(); // 자동형변환
        Searchable s = new SmartTelevision();

        s.search("");
        rc.turnOn();
        rc.setVolume(100);
        rc.turOff();
//        ((SmartTelevision)rc).search("www.naver.com");
        ((Searchable)rc).search("www.naver.com");

//        new MyClass(RemoteControl의 구현객체); // 매개값으로 무엇을 주면 될까요?
        MyClass myClass = new MyClass(new SmartTelevision());
//        myClass.methoB(new RemoteControl() {
//            @Override
//            public void turnOn() {
//
//            }
//
//            @Override
//            public void turOff() {
//
//            }
//
//            @Override
//            public void setVolume() {
//
//            }
//
//            @Override
//            public void setVolume(int volume) {
//
//            }
//        });

        // 다형성
        new MyClass(new Audio());
        new MyClass(new SmartTelevision());
        new MyClass(new Television());
    }
}
