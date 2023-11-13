package class_basic;

public class Car {
     private String model; // 인스턴스 멤버, 독립
    static  int year = 2023; // 정적 멤버(static),
    public  String getModel() {
        return model;
    }
    public  void setModel(String model){
        this.model = model;
    }

    static public void setYear(int newYear){

    }


}
