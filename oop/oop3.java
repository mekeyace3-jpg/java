package oop;

/* 파일명과 public class명은 동일해야 합니다. */
public class oop3 {
	public static void main(String[] args) {
		oop3_box ob = new oop3_box();
		ob.box(10,"정은지");
		ob.box("LG냉장고", "50%");
	}
}
/* 외부 클래스를 생성시 다른 파일에 해당 클래스명을 사용할 경우 동일한 이름을 사용하지 못함 */
class oop3_box{
	
	int point = 5000;	//field 영역에 전역변수 자료형을 선언
	
	
	public void box(int a, String b) {	//매개변수 선언시 자료형도 함께 적용해야 함
		System.out.println(a);
		System.out.println(b);
	}
	//동일한 이름의 method를 생성할 수 있음
	public void box(String c, String d) { //매개변수 선언 자료형이 다를 경우 또는 갯수가 다를경우 사용가능
		System.out.println(c);
		int point = 1000;
		System.out.println(point);		//지역변수의 값을 호출
		System.out.println(this.point);		//this 사용시 field에 있는 전역변수를 호출
		this.box();			//같은 class 영역에 있을 경우 해당 메소드를 호출시 this를 이용하여 호출가능
	}
	
	public void box() {
		System.out.println("오하영님의 포인트는 : " + this.point);
	}
	
}