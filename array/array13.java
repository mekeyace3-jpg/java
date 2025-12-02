package array;
//interface : List 부모 배열  (ArrayList, LinkedList, Vector) - 자식 클래스

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class array13 {

	public static void main(String[] args) {
		 //단일 Thread
		 List<String> al = new ArrayList<String>();
		 List<String> al2 = new LinkedList<String>();
		 
		 //멀티 Thread
		 List<String> al3 = new Vector<String>(); //ArrayList 배열에 가속화
		 al3.add(null);
		 array13_box ab = new array13_box();
		 ab.aaa();
		 ab.bbb();
	}
}

class array13_box{
	List<String> all = null;		//부모 interface를 활용하면, 자식 클래스 원하는 형태로 구현
	List<List<String>> alldata = null;
	Vector<String> data = new Vector<String>();
	
	public void aaa() {
		this.all = new ArrayList<String>();
	}
	public void bbb() {
		this.all = new LinkedList<String>();
	}
}
