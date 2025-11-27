package method;

import java.util.Arrays;
import java.util.Scanner;

//외부 class에서 void와 return 메소드를 활용하여 출력하는 코드로 작성
public class method13 {
	public static void main(String[] args) {
		method13_arr ma = new method13_arr();
		ma.myinfo();
	}
}

class method13_arr{
	final String data[][] = {
			{"hong","kim","park","jang"},
			{"a1234","b1234","c1234","abc1234"},
			{"1000","1500","2000","4500"}
	};
	private Scanner sc = null;
	String id,pw;	//사용자 아이디 및 패스워드를 받는 변수
	
	
	public void myinfo() {		//사용자 정보를 입력 후 포인트 결과를 받는 메소드
		this.sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		this.id = this.sc.next();
		System.out.println("패스워드를 입력하세요 : ");
		this.pw = this.sc.next();
		
		String result = this.point();
		
		System.out.println(result);
		this.sc.close();
	}
	
	private String point() {	//포인트를 조회해서 결과를 return 시킴
		String msg = "";	//return 하기 위한 변수
		
		//foreach (배열전용) - 배열 노드번호가 없음
		/*	2차배열에 더블 foreach 형태 적용한 방식
		for(String a[] : this.data) {	//그룹으로 반복
			System.out.println(Arrays.toString(a));
			for(String b : a) {		//그룹에 해당되는 데이터 만큼
					System.out.println(b);
			}
		}
		*/
		//2차배열 기준 하나의 그룹에서 사용하는 foreach 형태
		int no = 0;		//순차적인 배열번호 카운팅
		for(String a : this.data[0]) {	//그룹으로 반복
			if(a.equals(this.id) && this.data[1][no].equals(this.pw)){
				msg = this.data[2][no];	//포인트 그룹에 내용을 msg 변수에 삽입
				break;
			}
			no++;
		}
		System.out.println(no);
		if(no > this.data[0].length - 1) {
			msg = "아이디 와 비밀번호를 다시한번 확인 하세요!";
		}
		
		return msg;
	}
	
}