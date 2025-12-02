package dto;

import java.util.ArrayList;
import java.util.Scanner;

//사용자 정보를 모두 입력한 값을 2차 클래스 배열 저장하는 방식
/*
 MVC : Model, View, Controller 
 DTO,VO => Model
 Controller => Scanner
 View =>  System.out.println
*/
public class userinfo2 {
	public static void main(String[] args) {
		userinfo2_box ub = new userinfo2_box();
		ub.user();
	}
}

class userinfo2_box{
	private Scanner sc = null;
	user_dto dto = new user_dto();	//DTO를 호출
	//2차 클래스 생성
	ArrayList<ArrayList<Object>> alluser = new ArrayList<ArrayList<Object>>();
	
	public void user() {
		this.sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		this.dto.setUserid(this.sc.next());		//사용자가 입력한 값을 setter에 이관
		System.out.println("고객명을 입력하세요 : ");
		this.dto.setUsernm(this.sc.next());
		System.out.println("패스워드를 입력하세요 : ");
		this.dto.setUserpw(this.sc.next());
		System.out.println("나이를 입력하세요 : ");
		this.dto.setUserage(this.sc.nextInt());
		
		this.alluser.add(this.dto.users());	//DTO에서 생성한 1차 클래스를 데이터를 받음
		System.out.println(this.alluser);
		this.user();  //재귀 메소드 (자기 자신의 메소드를 재호출 하는 역활)
	}

}