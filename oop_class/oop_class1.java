package oop_class;

import java.util.ArrayList;

//oop_class1 => class1.java 연계작업 (상속)
//Controller
/*
  @Override : 부모 클래스에서 해당 메소드를 직접 로드 하여 출력하는 형태
  Overloading : 부모 클래스와 동일한 이름 이지만 성격이 다른 형태로 구성할 경우 또는 매개변수 자료형이 다를 경우
 */
public class oop_class1 extends class1 {	//extends : 부모 클래스를 로드
	/*
	 extends를 사용시 부모 클래스 안에 있는 모든 필드에 객체 활용할 수 있으며, 또한 모든 메소드를 활용할 수 있음
	 단, 부모 클래스에 있는 메소드를 자식 클래스에서 강제 변경은 불가능함
	 */
	
	//LinkedList<Integer> all5 = null;	
	
	@Override   //외부의 superclass를 로드하게 되면 해당 class에 있는 메소드를 가져온다는 뜻 (메소드 사항을 수정 불가)
	public void class1_abc() {
		Integer aaa = 5000;
		System.out.println(this.class1_bbb(50));
		//this.all5 = new LinkedList<Integer>();
		this.all5.add(500);
		System.out.println(this.all5);
		super.class1_abc();
	}
	
	public Integer class1_bbb(int a, int b) {
		//String user_email = "hong@nate.com";
		//return user_email;
		Integer aa = 50;
		return aa;
	}
	
	//Overloading
	public String class1_bbb(int a) {
		this.all = new ArrayList<String>();
		String pw = "a12345";
		return pw;
	}
	
	public oop_class1() {
		class1_abc();	
	}
	
	public static void main(String[] args) {
		new oop_class1();
	}

	
}
