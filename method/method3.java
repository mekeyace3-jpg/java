package method;
//클래스 안에 클래스
public class method3 {
	public static void main(String[] args) {
		method3_box mb = new method3_box();
		mb.abc();
		method3_box.method3_child mm = mb.new method3_child();
		mm.bbb();
	}
}

class method3_box{	//부모 클래스
	final String user = "정은지";	//전역변수
	
	public void abc() {	//부모 클래스에 해당 메소드
		System.out.println("부모 클래스에 있는 메소드");
		method3_child mc = new method3_child();
		System.out.println(mc.sum);
	}
	
	class method3_child{	//자식 클래스
		 int sum = 1000;
		 //String user = this.user;
		 public void bbb() {	//자식 클래스 안에 메소드
			 System.out.println("자식 클래스에 있는 메소드" + method3_box.this.user);
		 }
	}
	
}
