package banking;

import java.util.Scanner;

public class Account {
	
	String name, accountNum;
	int money;
	private Account[] bankAccount;
	private int numOfAccount=0;
	
	public Account(String name, String accountNum, int money) {
		this.name = name;
		this.accountNum = accountNum;
		this.money = money;
	}
	
	void showMenu() {
		System.out.println("----Menu----");
		System.out.println("1.계좌개설");
		System.out.println("2.입  금");
		System.out.println("3.출  금");
		System.out.println("4.계좌정보 출력");
		System.out.println("5.프로그램 종료");
	}
	
	void makeAccount() {
		Scanner scan = new Scanner(System.in);
		String aName, aAccountNum;
		int aMoney;
		System.out.println("***신규계좌개설***");
		System.out.println("계좌번호 : "); aAccountNum = scan.nextLine();
		System.out.println("고객이름 : "); aName = scan.nextLine();
		System.out.println("잔고 : "); aMoney = scan.nextInt();
		System.out.println("계좌계설이 완료되었습니다");
		
		
		bankAccount[numOfAccount++] = new Account(aName, aAccountNum, aMoney);
		
	}
	
	void depositMoney() {
		System.out.println("***입 금***");
		Scanner scan = new Scanner(System.in);
		System.out.println("계좌번호와 입금할 금액을 입력하세요");
		String searchAccountNum = scan.nextLine();
		
		for(int i=0; i<numOfAccount; i++) {
			if(searchAccountNum.compareTo(bankAccount[i].accountNum)==0) {
				System.out.println("계좌번호 : "+bankAccount[i].accountNum);
				int pushMoney = scan.nextInt();
				System.out.println("입금액 : "+pushMoney);
				System.out.println("입금이 완료되었습니다");
				bankAccount[i].money += pushMoney;
			} else {
				System.out.println("계좌번호를 잘못 입력하셨습니다.");
			}
		}
	}
	
	void withdrawMoney() {
		System.out.println("***출 금***");
		Scanner scan = new Scanner(System.in);
		System.out.println("계좌번호와 출금할 금액을 입력하세요");
		String searchAccountNum = scan.nextLine();
		
		for(int i=0; i<numOfAccount; i++) {
			if(searchAccountNum.compareTo(bankAccount[i].accountNum)==0) {
				System.out.println("계좌번호 : "+bankAccount[i].accountNum);
				int pullMoney = scan.nextInt();
				System.out.println("출금액 : "+pullMoney);
				if(bankAccount[i].money<pullMoney) {
					System.out.println("잔고가 부족합니다.");
				} else {
				System.out.println("출금이 완료되었습니다");
				bankAccount[i].money -= pullMoney;
				}
			} else {
				System.out.println("계좌번호를 잘못 입력하셨습니다.");
			}
		}
	}
	
	void showAccInfo() {
		System.out.println("***계좌정보출력***");
		System.out.println("---------------");
		System.out.println("계좌번호 : "+accountNum);
		System.out.println("고객이름 : "+name);
		System.out.println("잔고 : "+money);
		System.out.println("---------------");
		System.out.println("전체계좌정보 출력이 완료되었습니다");
		
	}
}
