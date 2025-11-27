package array;

import java.util.ArrayList;

//2차 클래스 배열 (기초)
public class array6 {

	public static void main(String[] args) {
		//2차 클래스 배열을 선언 (빈배열)
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		//1차 클래스 배열을 선언
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		all.add(al);	//1차 클래스에 등록된 배열값을 2차 클래스에 삽입
		ArrayList<Integer> al2 = new ArrayList<Integer>();	//신규 1차 클래스
		al2.add(1000);
		al2.add(2000);
		al2.add(3000);
		all.add(al2);	//신규1차 클래스 값을 2차 클래스에 삽입
		System.out.println(all);
	}

}
