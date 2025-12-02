package dto;
//Exception : 예외처리 사용법 (버그 및 오동작 발생)
public class excp1 {

	public static void main(String[] args) {
		//etc) 단어 검색하는 메소드
		String text = "보노하우스 맥스 서랍장 2단";
		int ck = text.indexOf("자바");	//양의정수 : 단어가 포함되어 있음, 음의정수 : -1 (없음)
		System.out.println(ck);
		if(ck == -1) {
			System.out.println("해당 되는 단어가 없습니다.");
		}
		else {
			System.out.println("해당 되는 단어가 포함되어 있습니다.");
		}
	}

}
