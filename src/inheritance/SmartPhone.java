package inheritance;

public class SmartPhone extends Cellphone {
    String interneMode;
    // 자식 객체를 생성
      // 부모 -> 자식

    public SmartPhone(String interneMode, String moedl, String color) {
        // super () : 부모생성자를 호출해줘 / this : 나
//        super(moedl, color);
        this.interneMode = interneMode;
        this.model = model;
        this.color = color;
        System.out.println("자식 생성자 호출");

    }

    void showInternetConnect(){
        System.out.println("현재 인터넷 접속은" + interneMode + "로 연결되었습니다.");
    }
}
