package method;

//main 메소드가 없는 class 이며, 단독으로 실행 할 수 없음

/*
public : 모든 package에서 공유하는 자료형
private : 외부 class에서는 접근이 안됨 내부 class에서만 사용가능
protected : 같은 package 안에서는 공유할 수 있음
*/
public class method6_box {
	
	private String user() {		//외부 접근 금지
		
		return null;
	}
	
	public String password() {	//모든 패키지에서 활용가능
		String pw = "a123456";
		return pw;
	}
	
	protected int money() {	//같은 패키지에서만 호출가능
		int a = 50000;
		return a;
	}
}
