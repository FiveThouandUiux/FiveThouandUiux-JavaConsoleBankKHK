package banking;

import java.util.Scanner;

public class BankingSystemMain {

	public static void main(String[] args) {
		
		Account account = new Account(null, null, 0);
		
		while(true) {
			account.showMenu();
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			switch (num) {
			case 1: {
				account.makeAccount();
				break;
			}
			case 2: {
				account.depositMoney();
				break;
			}
			case 3: {
				account.withdrawMoney();
				break;
			}
			case 4: {
				account.showAccInfo();
				break;
			}
			case 5: {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			} 
		 }
	}

}
