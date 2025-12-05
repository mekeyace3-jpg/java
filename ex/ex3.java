package ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 응용문제1
 외부 클래스를 이용하여 다음과 같이 작동되는 코드를 제작하시오. 
 [실행]
 "패스워드를 입력하세요 : "
 
 [결과] - return 메소드 활용
 1. 패스워드가 4자리 이하일 경우 => "패스워드는 5자리 이상 입력하셔야 합니다."
 2. 패스워드가 5자리 이상일 경우 => "패스워드가 올바르게 등록 되었습니다."   
 */
public class ex3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("패스워드를 입력하세요 : ");
	
	ex3_box eb = new ex3_box();
	String a = eb.box1(sc.next());
	System.out.println(a);
	eb.box3();
	sc.close();
    }
}

class ex3_box{
    static Integer a = 10;  //Heap 영역 (this 사용 유/무)
    Integer b = 15; //stack 영역
    
    public static String box2(){		//static : this 적용이 안됨
	System.out.println(new ex3_box().b);
	System.out.println(a);
	return null;
    }
    
    public String box3(){		//일반메소드 : this 적용이 가능함
	System.out.println(this.b);
	System.out.println(this.a);
	System.out.println(a);
	return null;
    }
    
    
    public String box1(String pw) {
	String msg = "";
	
	if(pw.length() >= 5) {
	    msg = "패스워드가 올바르게 등록 되었습니다.";
	}
	else {
	    msg = "패스워드는 5자리 이상 입력하셔야 합니다.";
	}
	return msg;
    }
    
    
}
