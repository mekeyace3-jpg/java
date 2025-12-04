package oop_class;

import java.util.Scanner;

public class inter_class2 {
    public static void main(String[] args) {
	new inter_box2();
    }
}

class inter_box2 implements inter2, inter3{
    Scanner sc = new Scanner(System.in);
   
    
    public inter_box2() {
	System.out.println("1. 신한은행 2. 국민은행  3.종료 : ");
	try {
	    Integer bankno = this.sc.nextInt();
	    switch(bankno) {
	    case 1:
		this.SH_bank();
	    break;
	    case 2:
		this.KB_bank();
	    break;
	    default:
		System.exit(0);
	    break;
	    }
	}
	catch (Exception e) {
	    System.out.println("숫자만 제발 입력해 주세요!");
	    new inter_box2();
	}
    }
    
    String userpass = "";	//사용자 패스워드 입력받는 변수
    Integer usermoney = 0;	//입금, 출금을 담당하는 변수
    static Integer money = 0;
    //inter2.bankname : interface 이름 중에서 inter2라는 interface에 bankname 변수값을 가져옴
    //inter3.bankname : inter3라는 bankname 변수값
    @Override
    public void SH_bank() {
	System.out.printf("%s은행 패스워드를 입력하세요 : %n",inter2.bankname);
        this.userpass = this.sc.next();
        if(inter2.password.equals(this.userpass)) {
            System.out.println("입금 금액을 입력해 주세요 : ");
            this.usermoney = this.sc.nextInt();
            this.money = inter2.money + this.usermoney;
            System.out.println("최종 금액은 " + this.money);
        }
        else {
            System.out.println("계좌비밀번호가 틀립니다.");
        }
        this.sc.close();
    }
    
    @Override
    public void KB_bank() {
	System.out.printf("%s은행 패스워드를 입력하세요 : %n",inter3.bankname);
        this.userpass = this.sc.next();
        if(inter3.password.equals(this.userpass)) {
            System.out.println("입금 금액을 입력해 주세요 : ");
            this.usermoney = this.sc.nextInt();
            this.money = inter3.money + this.usermoney;
            System.out.println("최종 금액은 " + this.money);
        }
        else {
            System.out.println("계좌비밀번호가 틀립니다.");
        }
        this.sc.close();
        
    }
}




