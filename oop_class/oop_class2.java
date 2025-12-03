package oop_class;

import java.util.ArrayList;
import java.util.List;

public class oop_class2 {
	public static void main(String[] args) {
		oop_class2_box ob = new oop_class2_box();
	}
}

class oop_class2_box extends class1 {		//extends : 상속은 하나의 클래스만 적용 됩니다. 
	
	List<ArrayList<String>> all2 = null;		//자식 클래스에서 생성한 2차 클래스
	
	public oop_class2_box() {
		this.all2 = new ArrayList<ArrayList<String>>();
		this.users();
	}
	
	public void users() {	//오버로딩 (자식클래스 직접 생성)
		this.all = new ArrayList<String>();	//부모 클래스에 필드에 있는 클래스 배열 로드
		this.all.add("권하민");
		this.all.add("허대회");
		this.all.add("박순수");
		this.all2.add(this.all);
		System.out.println(this.all2);		
	}
}
