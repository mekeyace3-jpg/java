package oop_class;

import java.util.ArrayList;
import java.util.LinkedList;

//Superclass
public class class1 {
	
	String userid = null;
	ArrayList<String> all = null;
	ArrayList<Integer> all2 = null;
	LinkedList<Integer> all5 = new LinkedList<Integer>();
	
	public void class1_abc() {
		String user = "홍길동";
		System.out.println(user + "class1에 사용되는 abc 메소드");
	}
	
	public String class1_bbb() throws Exception {
		this.userid = "hong";
		return this.userid;
	}
	
}
