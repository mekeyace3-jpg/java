package method;

import java.util.Arrays;

//method6.java와 method7.java 연계작업
public class method6 {
	public static void main(String[] args) {
		method6_box mb = new method6_box();	//method6_box.java 파일 연계
		String pw = mb.password();
		System.out.println(pw);
		
		int m = mb.money();
		System.out.println(m);
		
		method6_arr ma = new method6_arr();
		ma.arr1();
	}
}
//원시 1차 배열
class method6_arr{
	
	public void arr1() {
		int arr[] = {10,20,30};	//arr[] 원시배열을 선언
		System.out.println(arr.length);	//원시배열의 갯수
		System.out.println(arr[1]);		//해당 원시배열 값을 출력
		
		int[] arr2 = {100,200};
		System.out.println(arr2[1]);
		
		String user[] = {"네이버","네이트","구글"};
		System.out.println(user[2]);
		
		//Arrays : 배열 클래스를 이용하여 문자화하여 배열로 출력
		//파싱(Parsing) : 배열에 대한 구조화 정보를 변환하는 과정 
		//파서(Parser) : 데이터를 구문 분법을 분석하여 구조화 시키는 작업
		System.out.println(Arrays.toString(user)); //파싱
		
		int data[] = new int[4];	//숫자 빈배열 4개의 데이터를 입력 받을 수 있음
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		System.out.println(Arrays.toString(data));
		
		String lists[] = new String[3];	//문자 빈 배열 3개의 데이터
		lists[0] = "자바";
		lists[0] = "힘들어요";
		System.out.println(Arrays.toString(lists));
		
		//복합배열 Object 해당 라이브러리 클래스만 사용
		Object info[] = {"정은지",39,"오하영",40};
		System.out.println(Arrays.toString(info));
	}
		
}



