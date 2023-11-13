package class_basic;

import class_basic.Calc;

public class CalcExecute {
    public static void main(String[] args) {
        // 계산기 클래스 calc를 만들어 보세요
        // 인스턴스 필드
        // 1. 파이 : 3.14159
        // 2. 가장 최근 결과값 담는 필드

        Calc calc = Calc.getInstance();
        calc.plus(3, 5);
        System.out.println(calc.getResult());
        calc.multiply(5, 5);
        System.out.println(calc.getResult());

        System.out.println(calc.PI); // static 멤버에 접근하려면 ==> 클래스명.멤버이름

        calc.plus(1,2); // 인스턴스 메서드
        Calc.staticPlus(1,2); // static 메서드

    }

            // 메서드
                // 1. 사칙연산(plus(a,b), ..., divide(a,b))
                    // 사칙연산 메서드에서 결과값을 가장 최근 결과값을 담는 필드에 저장
                // 2. 가장 최근 결과값 필드를 리턴하는 메서드


}
