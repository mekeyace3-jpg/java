package oop;

public class oop5 {

	public static void main(String[] args) {
		op5_box ob = new op5_box(); //새로운 메모리 영역을 만든다
		ob.user = "에이핑크"; //외부 클래스에 있는 필드 영역에 전역변수값을 변경할 수 있음
		ob.abc();
		ob.abc();
//		op5_box ob2 = new op5_box();
//		ob2.abc();
//		new op5_box().abc(); //객체를 만들지 않고 새로운 클래스를 호출한다
	}

}

class op5_box {
	
	//private String user;  // 외부 클래스에서 해당되는 변수값을 변경하지 못함
	public String user; // 외부에서 변수에 대한 데이터 값을 변경할 수 있음
	int a = 0; //인스턴스를 생성할 때마다 값을 초기화한다
	static int b = 0; //heaps 영역에서 저장된 값을 유지한다
	public void abc() {
		this.a = this.a + 1;
		this.b = this.b + 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.user);
	}
}
