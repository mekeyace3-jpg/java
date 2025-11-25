package method;
//return 자료형 메소드 응용편
/*
응용편
숫자 10, 42, 51 세개의 숫자를 해당 메소드에 전달하여 3개의 곱한 결과를 메인 메소드에서 출력
하는 코드를 작성하시오. 

응용편2
사용자 정보 hong, hong@nate.com 을 메소드로 전송시
결과값은 다음과 같습니다.
"해당 사용자를 확인 하였습니다."  또는  "해당 정보가 일치하지 않습니다."
*/


public class method2 {
	public static void main(String[] args) {
		//결과출력
		method2_box mb = new method2_box();
		int result = mb.sum(10, 42, 51);
		System.out.println(result);
		
		/*
		 1. 사용자 아이디 및 이메일을 zzz라는 메소드에 전달
		 4. login 이라는 변수가 zzz 메소드에서 결과값을 받음
		*/
		String login = mb.zzz("hong1", "hong@nate.com");
		System.out.println(login); /* 5. 결과값 출력 */
	}
}

class method2_box{
	
	/*
	 2. main 메소드에서 해당 정보를 매개변수로 값을 전달받음
	 3. 조건문을 활용하여 결과값을 return 시킴 
	 */
	public String zzz(String a, String b) {
		String msg = "";
		
		if(a.equals("hong") && b.equals("hong@nate.com")) {
			msg = "해당 사용자를 확인 하였습니다.";
		}
		else {
			msg = "해당 정보가 일치하지 않습니다.";
		}
	
		return msg;
	}
	
	
	
	public int sum(int a, int b, int c) {
		int n = a * b * c;
		return n;
	}
	
	
}