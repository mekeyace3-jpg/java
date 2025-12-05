package ex;

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
	ArrayList<String> data = new ArrayList<String>();
	data.add("권하민");
	data.add("김고운");
	data.add("김동완");
	data.add("김예빈");
	data.add("박순수");
	data.add("신범석");
	data.add("허대회");
	data.add("박순수");
	Scanner sc = new Scanner(System.in);
	System.out.println("사용자 이름을 입력하세요 : ");
	//data.add(sc.next());	//add는 두가지 방식 (노드번호,데이터) or (데이터)
	String usernm = sc.next();
	/*
	int w = 0;
	while(w < data.size()) {
	    if(data.get(w).equals(usernm)) {
		data.remove(w);
	    }
	    w++;
	}
	*/
	int z = 0;	//index 번호를 지정하기 위해서 설정 변수
	for(String a : data) {
	    if(a.equals(usernm)) {
		data.remove(z);
	    }
	    z++;
	}
	
	System.out.println(data);
	
	//First,Last : add, remove, get
	//LIFO : 후입선출 => offer, poll
	//FIFO : 선입선출 => push, pop
	LinkedList<String> info = new LinkedList<String>();
	info.addFirst("신범석");
	info.addLast("김예빈");
	info.addFirst("김동완");
	info.push("허대회");
	//info.pop();   //맨 뒤에 있는 데이터 삭제
	//info.poll();
	System.out.println(info);
	
	
	LinkedList<String> aa = new LinkedList<String>(); //FIFO
	aa.offer("자바1");
	aa.offer("자바2");
	System.out.println(aa);
	LinkedList<String> bb = new LinkedList<String>(); //LIFO
	bb.push("자바1");
	bb.push("자바2");
	System.out.println(bb);
    }
}
