package Interface;

// 상속에선 안되나 인터페이스에선 다중 구현이 된다
public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turOff() {
        System.out.println("TV를 끕니다.");

    }

    @Override
    public void setVolume() {

    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else{
            this.volume = volume;
        }
        System.out.println("현재 TV의 볼륨 : " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
