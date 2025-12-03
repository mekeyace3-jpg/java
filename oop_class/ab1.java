package oop_class;

import java.util.Scanner;

//추상클래스
/*
1. 프로세서를 구현시 메소드를 일관화 시키기 위한 규격
2. 구현시 강제로 오버라이드를 사용해서 구현하는 형태
3. 표준화 및 다형성을 규칙적으로 사용하기 위함
*/
public class ab1 {
	public static void main(String[] args) {
		ab1_box ab = new ab1_box();
		ab.ab_method1();
	}
}

//외부 클래스
class ab1_box extends abs1{
	@Override
	public void ab_method1() {
	    	this.userid = "hong";
		System.out.println(this.userid);
		System.out.println(this.ab_method2());
	}
	@Override
	String ab_method2() {
		String aaa = "홍길동";
		return aaa;
	}
	@Override
	String ab_method2(String a, Integer b) {
		return null;
	}
}
//abs1은 추상 클래스를 선언
abstract class abs1{
    	String userid = null;	//추상 클래스에 전역변수
    	Scanner sc = null;
    	final String corp = "중앙정보처리학원";
    	
	//abstract 선언 사항이 있을경우 외부 클래스에서는 무조건 오버라이드 사용
	public abstract void ab_method1();		
	abstract String ab_method2();
	abstract String ab_method2(String a, Integer b);
	
	//abstract 선언이 없을 경우 외부 클래스에서 사용 유/무를 결정
	public Integer ab_method3(){ return 0; };	
}