package Interface;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) { // args : 매개변수
        try{
            String data1 = args[0]; // ArrayIndexOutOfBoundsException
            String data2 = args[1];
            int value1 = Integer.parseInt(data1); // NullPointerException
            int value2 = Integer.parseInt(data2);
            System.out.println("value1 + value2 = " + (value1 + value2));
            // 디버그 옆 점점점 클릭 , Edit , 파일명 선택, args 값 입력

            String str = null;
            str.charAt(2);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

        } finally {
            // 무조건 실행하고자 하는 코드를 집어넣는 곳
            System.out.println("무조건 실행한다.");
        }
        System.out.println("[프로그램] 정상 종료");
    }

}
