package oop;

import java.util.Scanner;

//응용문제1
/*
 외부 클래스를 사용하여 로그인이 가능한 조건문 코드를 작성하시오.
 단, 외부 클래스명은 user_login 입니다. 
 
 id : java
 pass : a123456
 
 [실행]
 아이디를 입력하세요 :
 
 패스워드를 입력하세요 :
 
 로그인 하셨습니다. or 회원정보가 맞지 않습니다.  
 */
public class oop7 {
	public static void main(String[] args) {
		user_login ul = new user_login();
		ul.logins();
	}
}

class user_login{
	private String userid, userpw;
	
	public void logins() {
		Scanner sc = new Scanner(System.in);	//한번 선언
		
		System.out.println("아이디를 입력하세요 : ");
		this.userid = sc.next();	//사용자가 직접입력한 값을 userid라는 변수 전달
		
		System.out.println("패스워드를 입력하세요 : ");
		this.userpw = sc.next();
		
		if(this.userid.equals("java") && this.userpw.equals("a123456")) {
			System.out.println("로그인 하셨습니다.");
		}
		else {
			System.out.println("회원정보가 맞지 않습니다.");
		}
		
		sc.close();   //해당 라이브러리를 종료
	}
	
	
}


