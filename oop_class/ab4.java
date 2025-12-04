package oop_class;

import java.util.*;


//abs_3.java 에 상속처리 후 코드를 작성
public class ab4 {
    public static void main(String[] args) {
	new ab4_box();
    }
}
//상품리뷰 관련 프로젝트 : 리뷰내용, 사용자명, 날짜
class ab4_box extends abs_3 {
    //next() => nextLine() 오류
    @Override
    public void userin() {
	try {
        	this.sdata = new ArrayList<String>();
        	System.out.println("사용자명을 입력하세요 : ");
        	this.sdata.add(this.sc.nextLine());
        	System.out.println("리뷰내용을 입력하세요 : ");
        	this.sdata.add(this.sc.nextLine());
        	this.sdata.add(this.todays());
        	
        	this.result(); //=>최종 결과를 출력하는 메소드로 이동
	}
	catch(Exception e) {
	    System.out.println("오류발생");
	}
	finally {
	     this.sc.close();
	}
    }
    @Override
    public Integer check_no(String data) {
	
	return null;
    }
    @Override
    public void result() throws Exception {	//출력 메소드
	System.out.println(this.sdata);	
    }

}
