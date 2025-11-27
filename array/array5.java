package array;

import java.util.ArrayList;
import java.util.Scanner;

//Scanner + ArrayList 사용방법
public class array5 {
	public static void main(String[] args) {
		array5_box ab = new array5_box();
		ab.abc();
		ab.bbb();
	}
}
class array5_box{
	private Scanner sc = null;
	ArrayList<String> user = null;	//배열의 객체 및 자료형만 생성
	ArrayList<Integer> no = null;
	
	public void abc() {
		this.user = new ArrayList<String>();	//해당 메소드를 실행시 클래스 빈 배열을 생성함
		this.sc = new Scanner(System.in);
		for(;;) {	//해당 반복문은 (무한루프) - break;
		//while(true) do ~ while(true) => boolean 형태로 무한루프 사용할 수 있음
		System.out.println("고객명을 등록하세요 : ");
			this.user.add(this.sc.next());
			System.out.println("계속 등록하시겠습니까? Y or N : ");
			String aw = this.sc.next();
			if(aw.equals("n") || aw.equals("N")) {	//사용자가 n 또는 N을 적용시 무한루프 종료
				break;
			}
	    }
		System.out.println("등록된 고객리스트 : " + this.user);
		this.sc.close();
	}
	
	public void bbb() {
		this.user = new ArrayList<String>();	//new 적용시 필드에 있는 배열은 초기화
		System.out.println(this.user);
	}
	
}
