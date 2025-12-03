package dto;

import java.util.ArrayList;
import java.util.Scanner;

public class excp7 {
	
//Controller
	public static void main(String[] args) {
		excp7_box eb = new excp7_box();
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		try {
				for(;;) {
					if(data.size() < 6) {		//최대 클래스 배열에 값이 6개 까지 반복 조건
						System.out.println("숫자를 입력해 주세요 : ");
						String userkey = sc.next(); 
						Integer ckno = eb.user_check(userkey);	//해당 메소드로 전달
						if(ckno != null) {
							data.add(ckno);
						}
					}
					else {
						break;
					}
				}	
		}
		catch (Exception e) {
			System.out.println("해당 컨트롤 코드 문제 발생!!");
		}
		finally {	//무조건 실행됨
			sc.close();
		}
		eb.result(data);	//excp7_box.java에 있는 result 메소드로 클래스 배열값을 전달
	}
}
