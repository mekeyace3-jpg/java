package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
  응용문제3
  다음 프로세서 실행 화면 형태처럼 결과가 진행 되는 코드를 작성하시오.
  
  [실행]
  고객명을 입력하세요 : 강감찬
  이메일을 입력하세요 : kang@gmail.com
  --> 단, 고객명과 이메일을 확인 하였을 경우 사용자가 없을 경우 "등록된 사용자가 없습니다." 출력
  
  변경할 휴대폰 번호를 입력하세요 : 01012345678
  
  [결과]
  강감찬 고객님 휴대폰 번호가 변경 되었습니다.
  전체 고객 배열값 출력
 */
public class ex6 {
    public static void main(String[] args) {
	new ex6_box();
    }
}
class ex6_box{
    final String member[][] = {
		{"홍길동","SKT","45","hong@nate.com","01012234556"},
		{"이순신","LGT","55","lee@gmail.com","01022309544"},
		{"강감찬","KT","25","kang@gmail.com","01036601688"},
		{"홍길동","LGT","37","gildong@gmail.com","01033965531"}
    };
    //1차 클래스 생성 및 setter를 이용하여 해당 java 필드에 값을 이관
    ex_dto ed = new ex_dto();	
    Scanner sc = null;
    ArrayList<ArrayList<String>> alluser = new ArrayList<ArrayList<String>>();
    public ex6_box() {
	for(String i[] : this.member) {
	    //DTO setter 메소드를 각 배열에 맞게 호출
	   this.ed.setUsername(i[0]);
	   this.ed.setCorp(i[1]);
	   this.ed.setAge(i[2]);
	   this.ed.setEmail(i[3]);
	   this.ed.setTel(i[4]);
	   //ex_dto.java => arrdata() 1차 클래스 메소드 값을 이관
	   this.alluser.add(this.ed.arrdata());	
	}
	System.out.println(this.alluser);
	this.ex6_search();
    }
    public void ex6_search() {	//사용자를 검색해서 해당 데이터를 수정하는 메소드
	this.sc = new Scanner(System.in);
	System.out.println("고객명을 입력하세요 : ");
	String sh_user = this.sc.next();
	System.out.println("이메일을 입력하세요 : ");
	String sh_email = this.sc.next();
	int w = 0;
	while(w < this.alluser.size()) {
	    if(this.alluser.get(w).get(0).equals(sh_user)) {	//고객명
		if(this.alluser.get(w).get(3).equals(sh_email)) {	//이메일
		    System.out.println("변경할 연락처 번호를 입력하세요 : ");
		    String tel = this.sc.next();
		    this.alluser.get(w).set(4, tel);
		    break;
		}
	    }
	    w++;
	}
	if(w >= this.alluser.size()) {
	    System.out.println("해당 고객 정보가 확인 되지 않습니다.");
	}
	System.out.println(this.alluser);
	this.sc.close();
    }
    
    
    
}