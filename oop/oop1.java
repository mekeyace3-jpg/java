package oop;		//package 단위명 = project 디렉토리 구분

import java.math.BigInteger;

public class oop1 {	//class 큰 단위 => 같은 이름의 class는 생성할 수 없음
/* 
1. package를 먼저 생성 합니다. (동일한 이름은 안됨) 
2. java class 파일을 생성
3. 제작할 method를 생성
 */
	
	//method = function과 같은 역활 
	public static void main(String[] args) {	//main method이며 단 한번만 사용
			
			
			String user = "에이핑크";		//문자형(class) 변수 선언 및 데이터 이관
			
			//System.out.print : 한줄에 모든 결과를 출력
			//System.out.println : line이며, 결과를 출력할 때 한칸 내려쓰기
			//System.out.printf : format이며, %s(문자), %d(숫자), %n(줄바꿈)
			System.out.print(user);	//console에 임의 결과값을 출력
			System.out.println("자바");
			System.out.printf("%s 님 %n %d 포인트 %n","오나영",1000);
			
			byte data = 127; //숫자(정수) -128 ~ 127
			short no = 32000; //숫자(정수) -32000 ~ 32500
			
			int age = 999999999;	//숫자(정수)
			System.out.println("당신의 나이는 " + age);
			long nu = 922337203612345123L; //8byte(64bit)
			System.out.println(nu);
			
			//BigInteger : Java에서 정수중에 가장 큰 단위 100경 단위를 사용할 수 있음
			BigInteger data2 = new BigInteger("12341564564564564");
			
			
			float point = 3.4123649f;	//소수(실수) - 4byte(32bit)
			System.out.println(point);
			
			double money = 5e-4; //소수(실수) - 8byte(64bit)
			System.out.println(money);
			
			char agree = 'Y';	//char(문자) - 최대 2byte(한글 기준)
			System.out.println(agree);
			
			boolean ck = true;	//boolean (true, false) 만 사용가능
	}

}

