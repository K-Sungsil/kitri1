package Interface;

// 인터페이스 -> 구현 객체가 필요함
public interface RemoteControl {
    public static int MAX_VOLUME = 10; // 상수
    public static int MIN_VOLUME = 0;
    // 동작 ( 메서드로 구현 )
    void turnOn();
    void turOff();
    void setVolume();

    void setVolume(int volume);
}
