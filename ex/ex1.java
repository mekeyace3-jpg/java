package ex;

import java.util.Arrays;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
	String str = "a1b2c3";
	byte[] bt = str.getBytes();
	//System.out.println(Arrays.toString(bt));
	String str2 = new String(bt);
	System.out.println(str2);
	
	
	/*
	 같은 자료형 또는 자료형 클래스라고 할지라도 new가 붙은 상황이면
	 인스턴스 영역(메모리)으로 변경 되므로 비교하는 상황이 달라질 수 있음 
	 */
	String a = "a1234";
	String b = "a1234";
	String c = new String("a1234").intern();
	String d = new String("a1234");
		
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(a.equals(c));
	System.out.println(c == d);

	//StringBuilder, StringBuffer : 쓰레드를 활용
	
	StringBuilder sb = new StringBuilder();	 //단일 쓰레드를 이용
	sb.append("김고운");
	sb.append("님 환영합니다.");
	sb.insert(3, "(kimkowoon)");
	sb.delete(0, 5);
	System.out.println(sb);
	
	StringBuffer sf = new StringBuffer();	//멀티 쓰레드를 이용
	sf.append("김예빈");
	sf.append("포인트는 0 입니다.");
	System.out.println(sf);
	
	int no = (int)(Math.ceil(Math.random()*10));
	System.out.println(no);
	int no2 = (int)(Math.floor(Math.random()*10));
	System.out.println(no2);
	int no3 = (int)(Math.round(Math.random()*10));
	System.out.println(no3);
	
	//Random 클래스를 활용하는 형태
	Random rd = new Random();
	//System.out.println(rd.nextInt(10)); //0 ~ 9 => 1 ~ 10
	System.out.println(rd.nextInt(6) + 5); //5 ~ 10
	
	String alg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	StringBuilder password = new StringBuilder();
	
	for(int f = 0; f < 8; f++) {
	    int idx = rd.nextInt(alg.length());
	    password.append(alg.charAt(idx));
	}
	System.out.println(password);
    }
}




