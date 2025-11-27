package method;

import java.util.Arrays;

//method6.java와 method7.java 연계작업
public class method7 {
	public static void main(String[] args) {
		method6_box mb = new method6_box();
		String pw = mb.password();
		System.out.println(pw);
		
		
		int data[] = {10,20,30,40,50};	//메인에서 배열 데이터 생성
		method7_arr ma = new method7_arr();
		ma.abc(data);	//해당 클래스에 abc 메소드에 배열을 전달
		
		String[] re = ma.bbb();
		System.out.println(Arrays.toString(re));
	}
}
//배열 class
class method7_arr{
	public void abc(int a[]) {	//매개변수 배열형태로 값을 받음
		System.out.println(Arrays.toString(a));
		/*
		  응용편
		  매개변수 a에 대한 배열값을 이용하여 해당 배열의 모든 총 합계 결과를
		  출력하는 코드를 작성하시오
		*/
		int w = 0;
		int sum = 0;	//배열의 결과 합계 누적변수
		do {
			sum = sum + a[w];
			w++;
		}while(w < a.length);
		
		System.out.println(sum);
		
	}
	
	public String[] bbb() {	//문자 원시배열 return 메소드
		String user[] = {"국어","영어","수학"};
		return user;	//배열 변수값을 return 시킴
	}
}
