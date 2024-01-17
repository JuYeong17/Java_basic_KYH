package poly.pra.pay;

import java.util.Objects;
import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("결제 수단을 입력하세요: ");
            String option = sc.next();
            if(option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            PayService payService = new PayService();
            payService.processPay(option, amount);
        }
    }
}
