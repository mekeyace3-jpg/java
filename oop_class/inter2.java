package oop_class;

public interface inter2 {
    	//interface inter1에 동일한 메소드명 및 매개변수 형태가 있더라도, 하나만 로드함
    	//public String names(String bbb);
    	//public void point();
    
   /* money, password, bankname : 필드변수가 inter3에 동일하게 사용할 수 있음
      해당 데이터값 또한 각각의 interface의 값을 유지할 수 있음
   */ 
   static Integer money = 1000000;	//입금금액
   String password = "1234";	//비밀번호
   String bankname = "신한";	//은행명
   public void SH_bank();
}
