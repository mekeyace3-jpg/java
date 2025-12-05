package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ex4 {
    public static void main(String[] args) {
	Integer a[] = {10,100,20,200,30,300,40};
	ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(a));
	LinkedList<Integer> bb = new LinkedList<Integer>();
	Vector<Integer> cc = new Vector<Integer>();
	/*
	  Vector : 순차적으로 입력사항 느림, 검색,삽입 빠름
	*/
	bb.add(1000);
	bb.add(2000);
	bb.add(3000);
	bb.add(4000);
	Integer[] b = bb.toArray(new Integer[0]);
	//System.out.println(Arrays.toString(b));
	
	//2차 원시배열 => 2차 클래스 배열로 변환
	//http://mekeyace.kbsn.or.kr/muser.txt
	ex4_box eb = new ex4_box();
	
    }
}
/*
 응용문제2. String data[][] 자료형에 있는 원시배열 데이터를 활용하여
 다음과 같이 출력되는 클래스배열 구조를 코드로 제작합니다.
 [결과]
 [[대한민국,40],[일본,35],[중국,70],[베트남,55],[태국,32]]
*/
class ex4_box{
    String data[][] = {
		{"대한민국","일본","중국","베트남","태국"},
		{"40","35","70","55","32"}
    };
    public ex4_box() {	//즉시실행
	this.data();
    }
    public void data() {
	ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
	int w = 0;
	while(w < data[0].length) {
	    ArrayList<String> result = this.al(data[0][w], data[1][w]);
	    all.add(result);	//return 받은 1차 클래스 배열값을 2차 클래스 배열로 삽입
	    w++;
	}
	System.out.println(all);
    }
    
    public ArrayList<String> al(String k, String n) { //1차 클래스 배열이 제작되는 메소드
	ArrayList<String> a = new ArrayList<String>();
	a.add(k);
	a.add(n);
	return a;
    }
}




