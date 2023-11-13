package class_basic;

public class Calc {
    double pi = 3.14159; // 인스턴스필드
    public static final double PI = 3.14159; // 상수
    private  int result; // 인스턴스필드

    private static Calc singleton = new Calc();

    private Calc(){}

    static Calc getInstance(){
        return singleton;
    }


    int plus(int a, int b) {
        this.result = a + b;
        return this.result;
    }
    int minus(int a, int b) {
        this.result = a - b;
        return this.result;
    }
    int multiply(int a, int b) {
        this.result = a * b;
        return this.result;
    }
    int divide(int a, int b) {
        this.result = a / b;
        return this.result;
    }
    int modulo(int a, int b) {
        this.result = a % b;
        return this.result;
    }
    public int getResult() {
        return this.result;
    }

    static int staticPlus(int a, int b){
        return a+b ;
    }

}
