package dto;

import java.util.*;			//해당 라이브러리를 모두 관리하는 형태의 구조

public class ins {
	public static void main(String[] args) {
		new ins_box("aa11"); //해당 클래스에서 즉시실행 메소드를 호출 (객체X, 클래스X)
		//new ins_box();	=> 매개변수가 없는 즉시실행 메소드
	}
}

class ins_box{
	Scanner sc = null;
	List<String> ls = null;
	LinkedList<Object> ll = null;
	ArrayList<ArrayList<String>> aa = null;
	
	public ins_box(String key) {	//해당 즉시실행 메소드에서 인자값을 받은 후 조건처리함
		if(key.equals("aa11")) {
			this.ins_abc();	//해당 key 조건이 맞을 경우 해당 메소드를 실행시킴
		}
		else {
			System.out.println("올바른 접근이 아닙니다.");
			System.exit(0);
		}
	}
	
	public ins_box() {	//즉시실행 메소드 (class명 무조건 동일해야함)
		this.sc = new Scanner(System.in);
		this.ls = new ArrayList<String>();
		this.aa = new ArrayList<ArrayList<String>>();
		this.ins_abc();		//즉시실행 메소드에서 접근하도록 함
	}
	
	private void ins_abc() {		//외부 클래스에서 접근 금지
		System.out.println("사용자 입력사항 : ");
		String aa = this.sc.next();
		System.out.println(aa);
	}
	
}
