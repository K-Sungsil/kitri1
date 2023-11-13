package Interface;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try{
            int result = data.length(); // 예외 NullPointerException data : null
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e){ // NullPointerException : 자식
            // RuntimeException : 부모 // Exception : 조부
//            e.printStackTrace();
//            System.out.println("예외 메시지 : " + e.getMessage());
        } finally {
            System.out.println("내 코드는 무조건 실행해줘!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}