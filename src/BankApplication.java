import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = Boolean.parseBoolean("true");

        while (run){
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            int num = scanner.nextInt();

            if(num == 1){
                createAccount();
            } else if( num == 2){
                accountList();
            } else if( num == 3){
                deposit();
            } else if( num == 4){
                withdraw();
            } else if( num == 5) {
                run = false;
            }
        } System.out.println("프로그램 종료");
    }
    private static void circlePrintln01() {
        System.out.println("-------------");
        System.out.println("계좌 생성");
        System.out.println("-------------");
    }
    private static void circlePrintln02() {
        System.out.println("-------------");
        System.out.println("계좌 목록");
        System.out.println("-------------");
    }
    private static void circlePrintln03() {
        System.out.println("-------------");
        System.out.println("예금");
        System.out.println("-------------");
    }
    private static void circlePrintln04() {
        System.out.println("-------------");
        System.out.println("출금");
        System.out.println("-------------");
    }
    //계좌생성하기
    private static void createAccount() {

        circlePrintln01();

        System.out.print("계좌번호 : ");
        String accountNum = scanner.next();
        System.out.print("계좌주 : ");
        String accountOwner = scanner.next();
        System.out.print("초기입금액 : ");
        int accountBal = scanner.nextInt();

        Account newAccount = new Account(accountNum, accountOwner, accountBal);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }
    // 계좌목록 보기
    private static void accountList() {

        circlePrintln02();

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (accountArray[i] != null) {
                System.out.print(account.toString());
            }
        }

    }

    // 예금하기
    private static void deposit() {

        circlePrintln03();

        System.out.print("계좌 번호 : ");
        String accountNum = scanner.next();
        System.out.print("예금액 : ");
        int accountBal = scanner.nextInt();

        Account account = findAccount(accountNum);

        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }
        if (!account.getAno().equals(accountNum)) {
            System.out.println("계좌번호를 잘못 입력하셨습니다.");
            return;
        }

        account.setBalance(account.getBalance() + accountBal);
        System.out.println("예금이 성공되었습니다.");

    }

    // 출금하기
    private static void withdraw() {

        circlePrintln04();

        System.out.print("계좌번호 : ");
        String accountNum = scanner.next();
        System.out.print("출금액 : ");
        int accountBal = scanner.nextInt();

        Account account = findAccount(accountNum);

        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }
        if (!account.getAno().equals(accountNum)) {
            System.out.println("계좌번호를 잘못 입력하셨습니다.");
            return;
        }
        if (account.getBalance() == 0 || account.getBalance() < accountBal || account.getBalance() - accountBal < 0) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        account.setBalance(account.getBalance() - accountBal);
        System.out.println("출금이 성공되었습니다.");

    }

    private static Account findAccount(String ano) {

        Account account = null;

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String accountNum = accountArray[i].getAno();
                if (accountNum.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }

        }
        return account;
    }
}
