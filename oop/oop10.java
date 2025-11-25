package oop;

import java.util.Scanner;

//더블 반복문
public class oop10 {
	public static void main(String[] args) {
		oop10_box ob = new oop10_box();
		//ob.aaa();
		ob.bbb();
	}
}

class oop10_box{
	Scanner sc = new Scanner(System.in);
	int w, ww;
	/*
	 응용문제
	 [실행]
	 구구단 시작 단수를 입력하세요 : 3
	 구구단 끝 단수를 입력하세요 : 8
	 
	 [결과]
	 3단 부터 8단까지의 모든 홀수의 결과 총 합계는 : 
	 3 * 1 = 3  
	 3 * 3 = 9
	 5 * 1 = 5
	 5 * 3 = 15
   */
	public void bbb() {
		
		
	}
	
	
	public void aaa() {
		this.w = 1;
		while(this.w <= 9) {
			this.ww = 1;
			do {
				if(this.ww <= 5) {	//구구단 별로 5까지만 출력
				System.out.printf("%d * %d = %d %n",this.w,this.ww,this.w*this.ww);
				}
				else {
					break;	//해당 조건이 맞을 경우 반복문 강제 종료
				}
				this.ww++;
			}while(this.ww <= 9);
			
			this.w++;
		}	
	}
	
}