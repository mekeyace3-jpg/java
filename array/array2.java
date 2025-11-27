package array;

import java.util.ArrayList;
import java.util.Arrays;

//클래스 배열
public class array2 {
	public static void main(String[] args) {
		//ArrayList : 클래스 배열 중 하나의 형태
		/*
		 add : 배열에 데이터를 추가
		 remove : 배열에 데이터를 삭제
		 size : 배열에 데이터 전체 갯수
		 clear : 배열에 데이터를 초기화 
		 get : 배열에 특정 노드번호를 적용하여 데이터 출력 
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();	//숫자 클래스 배열
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		System.out.println(al);
		al.remove(2);	//remove(배열번호)
		System.out.println(al);
		System.out.println(al.get(1));	//get(배열번호)
		System.out.println(al.size());
		al.clear();
		System.out.println(al);
		
		//문자 형태의 클래스 배열
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("권하민");
		al2.add("김고운");
		al2.add("김동완");
		al2.add("김예빈");
		System.out.println(al2);
		
		//배열 + 배열
		//clone() : 기존에 있는 클래스 배열을 복사하는 기능
		ArrayList<String> al3 = (ArrayList)al2.clone();
		al3.add("박순수");
		al3.add("신범석");
		al3.add("허대회");
		
		System.out.println(al3);
		
		//원시배열 => 클래스배열 변환
		//Arrays.asList => 원시배열 값을 클래스 배열로 모든 데이터를 변환시킬 때 사용
		Integer data[] = {100,200,300,400};
		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(all);
		all.set(2, 500);		//set(배열번호,데이터값);	=> 기존에 있는 배열번호에 값이 변경됨
		System.out.println(all);
		all.add(2, 600);	//add(배열번호,데이터값) => 해당 배열 번호 기준으로 데이터가 삽입
		System.out.println(all);
	}
}
