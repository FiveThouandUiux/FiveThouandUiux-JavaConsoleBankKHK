package banking;

import java.util.Scanner;

public class AccountManager {
	int num;

	void AccountManager() {
//		System.out.println("***신규계좌개설***");
//		System.out.println("1.보통계좌");
//		System.out.println("2.신용신뢰계좌");
		Scanner scan = new Scanner(System.in);
//		num = scan.nextInt();
//	if(num==1) {
	class NormalAccount extends Account {
		private int interest;
		
		public NormalAccount(String name, String accountNum, int money, int interest) {
			super(name, accountNum, money);
			this.interest = interest;
		}
		
		@Override
		void makeAccount() {
			super.makeAccount();
			String aName, aAccountNum;
			int aMoney;
			System.out.println("계좌번호 : "); aAccountNum = scan.nextLine();
			System.out.println("고객이름 : "); aName = scan.nextLine();
			System.out.println("잔고 : "); aMoney = scan.nextInt();
			System.out.println("기본이자%(정수형태로 입력) : "); interest = scan.nextInt();;
			
			bankAccount[numOfAccount++] = new NormalAccount(aName, aAccountNum, aMoney, interest);
		}
		
		@Override
		void depositMoney() {
			super.depositMoney();
		}
	}
//	}

	class HighCreditAccount extends Account {
		private int interest;
		private int addInterest;

		public HighCreditAccount(String name, String accountNum, int money, int interest,int addInterest) {
			super(name, accountNum, money);
			this.interest = interest;
			this.addInterest = addInterest;
		}
		
		@Override
		void makeAccount() {
			super.makeAccount();
			System.out.println("***신규계좌개설***");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			String aName, aAccountNum;
			int aMoney;
			if(num==2) {
			System.out.println("계좌번호 : "); aAccountNum = scan.nextLine();
			System.out.println("고객이름 : "); aName = scan.nextLine();
			System.out.println("잔고 : "); aMoney = scan.nextInt();
			System.out.println("기본이자%(정수형태로 입력) : "); interest = scan.nextInt();;
			System.out.println("신용등급(A,B,C등급) : "); String grade = scan.nextLine();
			
			if(grade=="A" || grade=="a") {
				addInterest = 7 ;
			} else if(grade=="B" || grade=="b") {
				addInterest = 4 ;
			}else if(grade=="C" || grade=="c") {
				addInterest = 2 ;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println("계좌계설이 완료되었습니다");
			bankAccount[numOfAccount++] = new HighCreditAccount(aName, aAccountNum, aMoney, interest,addInterest);
			}
		}
	}
}
}
