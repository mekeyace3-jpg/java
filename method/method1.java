package method;

import java.util.Scanner;

public class method1 {
	public static void main(String[] args) {
		method1_box mb = new method1_box();
		//mb.aaa();
		
		/* void 메소드 외에는 모두 return을 활용합니다.
		   return 메소드를 사용시 주의사항은 결과값을 받는 자료형과 메소드를 생성하는 자료형 및 return 자료형
		   3가지 모두 동일하게 사용해야 합니다.  
		   
		   - 매개변수는 return에 결과값에 대한 자료형과는 별개 입니다.
		   - 단,return에 대한 최종 결과값은 자료형이 일치 해야함
		*/
		
		String result = mb.ccc(25);
		System.out.println(result);
		
		int no = mb.ddd();
		System.out.println(no);
		
		double money = mb.zzz();
		System.out.println(money);
	}
}

class method1_box{
	private Scanner sc = null;		//해당 라이브러리를 호출만 상황이며, 작동은 중지상태
	final int no = 1000;	//final 설정시 해당 값은 고정값 (상수)
	
	public void aaa() {
		this.sc = new Scanner(System.in);
		this.bbb();	//private 메소드 호출 (외부에서는 접근이 안되는 메소드)
	}
	private void bbb() {
		System.out.println("나이를 입력하세요");
		int age = this.sc.nextInt();
		System.out.println(age);
	}
	
	public double zzz() {
		float a = 0.23f;
		return a;
	}
	
	public String ccc(int n) {	//문자 자료형 메소드
		String user = "";		
		if(n == 25) {		//조건문, 반복문에 변수를 생성한 값은 return을 하지 못함
			user = "미국";
		}
		else {
			user = "대한민국";
		}
		return user;
	}
	public int ddd() {	//숫자 자료형 메소드
		int n = 5000;
		return n;
	}
}
