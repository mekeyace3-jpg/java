package oop;

import java.util.Scanner;

//선택문 : switch ~ case
public class oop11 {
	public static void main(String[] args) {
		oop11_box ob = new oop11_box();
		//ob.aaa();
		ob.bbb();
	}
}

class oop11_box{
	Scanner sc = new Scanner(System.in);
	
	/*
	 응용편 - 결과에 대한 System.out.println 는 해당 코드에서 한번 사용합니다.
	 [실행] 
	 [1.하나은행, 2.신한은행, 3.국민은행] : 
	 	 
	 [결과]
	 하나은행
	 잔액 0 원
	 
	 신한은행
	 잔액 900000원
	 
	 국민은행
	 잔액 68000원
	*/
	
	public void bbb() {
		System.out.println("[1.하나은행, 2.신한은행, 3.국민은행] : ");
		int part = this.sc.nextInt();
		String bank = "";
		int money = 0;
		
		switch(part) {
			case 1:
				bank = "하나은행";
				money = 0;
			break;
			
			case 2:
				bank = "신한은행";
				money = 900000;
			break;
			
			case 3:
				bank = "국민은행";
				money = 68000;
			break;
			default:
				bank = "해당 코드는 1~3 까지만 이용하세요";
			break;
		}
		System.out.printf("%s %n잔액 %d 원",bank,money);
		
	}
	
	
	
	
	public void aaa() {
	
		String card = "신한";
		switch(card) {
		
		case "신한카드":
		case "신한":
			System.out.println("신한카드 선택");
		break;
		
		case "하나":
			System.out.println("하나카드 선택");
		break;
		
		default:
			System.out.println("서비스 준비중 입니다.");
		break;
		}
		
		
		/* JDK 17 ~
		String card = "신한";
		
		switch(card) {
		case "신한" -> System.out.println("신한카드 선택");
		case "하나" -> System.out.println("하나카드 선택");
		default -> System.out.println("서비스 준비중 입니다.");
		}
		*/
	}
	
}
