package method;

import java.util.Scanner;

//배열을 이용한 최종 응용편

//http://mekeyace.kbsn.or.kr/java_arr.txt
public class method12 {
	public static void main(String[] args) {
		mehtod12_arr ma = new mehtod12_arr();
		String r = ma.result();	//메인 메소드에서 해당 메소드를 호출 후 결과를 받는 코드
		System.out.println(r);   //return 결과를 출력
	}
}
class mehtod12_arr{
	private String data[][] = {
			{"김민지","서은진","김선숙","명동건","강휘"},
			{"A","B","AB","O","B"},
			{"SKT","KT","LGT","LGT","KT"}
	};
	private Scanner sc = null;
	private String corp = null;		//통신사 이름
	
	
	public String result() {	//mehtod12_arr 에서 메소드 배열 및 인터페이스 라이브러리 작동
		this.sc = new Scanner(System.in);
		System.out.println("통신사 이름을 입력하세요 : ");
		//intern() : equals 없이 비교연산기호 사용가능
		this.corp = this.sc.next().intern();	
		
		//StringBuilder : 문자열을 이어붙이기 할 수 있는 클래스
		StringBuilder sb = new StringBuilder();
		
		int w = 0;
		while(w < this.data[0].length) {
			if(this.data[2][w] == this.corp) {
				sb.append(this.data[0][w]+",");		//append : 문자열 노드 형태로 추가(+=)
			}
			w++;
		}
		//sb.delete : 문자열을 삭제하고자 하는 클래스 (삭제하고자 하는 문자열 갯수, 삭제 후 문자열갯수)
		sb.delete(sb.length() -1, sb.length());	
		//System.out.println(sb);
		this.sc.close();
		//toString() : 배열이나, 문자열(StringBuilder)을 String으로 변환
		return sb.toString();
	}
	
	
}


