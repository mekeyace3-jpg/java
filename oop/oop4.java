package oop;

public class oop4 {
	//static : 메모리 영역 (Heap) => stack 영역과는 다른 메모리 영역
	
	static String user = "apink";	
	String user2 = "에이핑크";	//stack 영역
	
	public static void main(String[] args) {		//static 메소드에서는 절대 this 불가능
		System.out.println(user);
		
		String user3 = "정은지";	//heap에서 만들어지는 지역변수	
		System.out.println(user3);	
		
		oop4 op = new oop4();
		System.out.println(op.user2);
		op.box();
	}
	
	
	public void box() { //일반 메소드
		System.out.println(this.user2); //static이 아닐 경우 this를 활용할 수 있다
		System.out.println(oop4.user); //static일 경우에도 this를 활용할 수 있다(일반 메소드 한에서)
	}									//this 대신 변수명 사용가능

}

