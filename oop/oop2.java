package oop;

public class oop2 {

	public static void main(String[] args) {
		//oop2_box (클래스명)
		//new oop2_box() (객체)
		//ob 변수가 (인스턴스) - 메모리 영역
		oop2_box ob = new oop2_box();
		ob.box();		//해당 인스턴스에 저장된 클래스 객체에 box()라는 메소드를 실행
		ob.box2();
		
		oop2_box2 ob2 = new oop2_box2();
		ob2.box();
	}
	
}

class oop2_box2{
	public void box() {
		System.out.println("oop2_box2에서 생성된 메소드");
	}
}

//oop2_box : 외부 class 선언
//void : 기본 메소드 (반환이 없는 메소드)
class oop2_box{
	
	public void box() {		//oop2_box class 안에 box()라는 메소드를 생성
		System.out.println("외부 클래스 및 메소드 호출!!");
	}
	public void box2() {
		System.out.println("box2 메소드 호출!!");
	}
	
}