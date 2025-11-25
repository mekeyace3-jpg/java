package oop;

import java.util.Scanner;		//외부에서 사용하는 라이브러리를 호출 (class도 가능)

public class oop6 {
	public static void main(String[] args) {
		oop6_box ob = new oop6_box();
		ob.if_oop();
	}
}

class oop6_box{
	int a,b;	//전역변수 선언
	String id = "";
	
	public void if_oop() {
		
		//Scanner : Java에서 console로 사용자가 입력하는 값을 실행시켜 주는 라이브러리
		Scanner sc = new Scanner(System.in);	//System.in : 시스템에서 직접 입력함
		System.out.println("아이디를 입력하세요 : ");
		this.id = sc.next();	//next() : 문자를 받는 메소드
				
		//equals : 문자만 비교 검토할 수 있는 메소드이며, 사용자가 입력한 값을 비교할 수 있음
		// == : 개발자가 직접 입력한 문자는 사용가능
		if(this.id.equals("apink")) {
			System.out.println("로그인 하셨습니다.");
		}
		else if(!this.id.equals("apink")) {	//같지 않을 경우
			System.out.println("확인되지 않은 아이디 입니다.");
		}
		//연산기호 ( == , !=, >=, <=, <, >) , 문자연산 (equals, !equals);
		
		
		/*	
		this.a = 10;	//전역변수에 값을 이관시킴
		this.b = 5;
		*/
		System.out.println("첫번째 숫자를 입력하세요 : ");
		this.a = sc.nextInt();	//nextInt() this.a의 변수 자료형에 맞게 next를 선택 해야함
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		this.b = sc.nextInt();
		
		
		if(a < b){ 	//비교
		    System.out.println("b값이 큽니다.");
		}
		else if(a > b){  
			System.out.println("a값이 큽니다.");
		}
		else{       
			System.out.println("두 값이 같습니다.");
		}
	}
	
}