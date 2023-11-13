package inheritance;

public class PhoneExecute {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("5G", "iPhone15", "White");
        new Cellphone();
//        CellPhone cellPhone = new CellPhone();
        smartPhone.model = "Galaxy23";
        smartPhone.color = "white";
        smartPhone.powerOn();
        smartPhone.hangUp();
        smartPhone.showInternetConnect();

    }
}
