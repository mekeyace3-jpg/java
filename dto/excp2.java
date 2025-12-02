package dto;

import java.util.ArrayList;

//예외처리로 버그 발생시 수정 후 프로세서를 최종 설정

//unBoxing(언박싱), Boxing(박싱)
/*
int => Integer  (박싱) - Heap 
Integer => int (언박싱) - Stack
*/
public class excp2 {
	public static void main(String[] args) {
		int b = 0;
		String a = null;
		
		try {		
			a = "50a00bb";
			b = 1000;
			b = b + Integer.parseInt(a);		//1. 오류발생
		}
		catch (NumberFormatException ne) {
			a = a.replaceAll("[a-zA-Z]", ""); //2. 정규식 코드 [a-zA-Z] : 사용자가 입력한 값을 수정
			//3. 재실행
			b = 1000;
			//b = b + Integer.parseInt(a); //기본 타입이 int (기본정수)
			b = b + Integer.valueOf(a);	//캐시메모리 객체 타입
		}
		catch (Exception e) {
			System.out.println(e);
		}
		// finally : try 상태도 작동, catch 상태에서도 작동 
		
		System.out.println(b); //최종 결과
	}
}
