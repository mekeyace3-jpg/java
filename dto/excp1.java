package dto;

import java.util.*;


//Exception : 예외처리 사용법 (버그 및 오동작 발생)
public class excp1 {

	public static void main(String[] args) {
		//etc) 단어 검색하는 메소드
		String text = "보노하우스 맥스 서랍장 2단";
		boolean ck = text.contains("자바");	//true : 단어포함, false : 미포함 단어
		//System.out.println(ck);
		
		/*  //indexOf = Javascript
		int ck = text.indexOf("자바");	//양의정수 : 단어가 포함되어 있음, 음의정수 : -1 (없음)
		System.out.println(ck);
		if(ck == -1) {
			System.out.println("해당 되는 단어가 없습니다.");
		}
		else {
			System.out.println("해당 되는 단어가 포함되어 있습니다.");
		}
		*/
		new excp1_box();
	}
}
class excp1_box{
	Scanner sc = null;
	public excp1_box() {
		this.sc = new Scanner(System.in);
		this.abc();
	}
	//Exception : try ~ catch [try : 정상적인 프로세서 실행, catch : 비정상적인 오류발생]
	//finally : 버그 또는 오류가 발생시 임시조치를 적용한 구조
	/*
	 1. 사용자가 입력실수로 인한 정보전달이 안되는 경우
	 2. 개발자가 프로그램 오류시 정확한 오류 파악을 하기위한 수단
	 3. 강제 프로세서의 대한 정보 수집 및 종료 하기위한 수단 
	 */
	
	private void abc() {
		try {
			System.out.println("숫자만 입력하세요 : ");
			Integer a = this.sc.nextInt();
			//String a = this.sc.nextLine();
			//Integer b= Integer.parseInt(a);
			System.out.println(a);
		}
		/*//Exception의 자식 오류 처리 형태
		catch (InputMismatchException e) {
			System.out.println("숫자를 잘못 입력 하셨어요!!");
		}
		catch (NumberFormatException ne) {
			System.out.println("숫자변환 오류!!");
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열에 값이 추가시 올바른 자료형이 아님");
		}*/
		catch(Exception ex) {	//Exception : 상위 예외처리(부모)
			System.out.println(ex);
			ex.printStackTrace(); //오류발생시 해당 라인을 확인하는 목적
			//System.exit(0);
		}
		finally {
			System.out.println("입력 오류가 발생 하였으로 프로세서를 재실행 합니다.");
			//new excp1_box();	//전체 즉시실행 메소드 부터 다시 재실행 하도록 설정
		}
	
	}
	
}
