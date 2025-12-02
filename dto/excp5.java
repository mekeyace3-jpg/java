package dto;

import java.io.IOException;

//Exception 예외처리 클래스 
public class excp5 {
	public static void main(String[] args) {
		try {
			new excp5_box().abc("123");
		}catch (Exception aaaa) {
			System.out.println("메인코드 : " + aaaa);
			//e.printStackTrace();
		}
	}
}
/*
 throws : 예외가 발생할 수 있는 오류를 미리선언 (호출자 잘못)
 throw : 예외처리가 발생 되었을 때 해당 호출한 메소드로 return 결과로 보냄 (호출받은 사람)  
 */
class excp5_box{
	public void abc(String a) throws Exception, IOException {
		Integer k = Integer.valueOf(a) + Integer.valueOf("200");
		System.out.println(k);
		
		/*
		//throw 사용시 메소드에서 throws를 사용해야만 합니다.
		Exception ep = new Exception();	//Exception 클래스
		//throw == return
		throw ep;		//코드에 가장 아래에 적용하게 됩니다. 오류 발생시 자신을 호출한 class 메소드에 오류 메세지 전송
		*/
		throw new Exception();
	}
	
}