package oop;

import java.util.Scanner;

//반복문
public class oop9 {
	public static void main(String[] args) {
			oop9_box ob = new oop9_box();
			//ob.abc();
			//ob.bbb();
			//ob.ccc();
			ob.ddd();
	}
}

class oop9_box{
	int a;
	int b = 1;
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	
	/*
	응용편
	5 ~ 45까지 숫자 반복 (반복문 1개) - (조건문 1개)
	[실행]
	[1.짝수, 2.홀수] : 1 
	
	*/
	public void ddd() {
		System.out.println("[1.짝수, 2.홀수] : ");
		byte part = this.sc.nextByte();	//-128 ~ 127
		byte w = 5;
		while(w <= 45) {
			if(w % 2 == (part - 1)) {
				System.out.println(w);
			}
			w++;
		}
		this.sc.close();
		
	}
	
	
	
	/* 응용편 
	 [실행화면]
	 첫번째 숫자를 입력하세요 : 5
	 보고 싶은 구구단을 입력하세요 : 2
	 
	 [결과]
	 2 * 1 = 2
	 2 * 2 = 4
	 2 * 3 = 6
	 2 * 4 = 8
	 2 * 5 = 10
	*/
	public void ccc() {
		
		this.sc.close();
	}
	
	
	
	public void bbb() {	//반복문 + if문
		
		do {
			if(this.b % 8 == 0) {
				//this.sum += this.b;
				this.sum = this.sum + this.b;
			}
			
			this.b++;
		}while(this.b <= 100);
		
		System.out.println(this.sum);
		
	}
	
	
	public void abc() {	//for ~ do~while 문
		
		/*
		 * for (a = 10; a > 0; a--) { System.out.println(a); }
		 */
		/*
		 * while(b <= 10) { System.out.println(b); b++; }
		 */
		
		do {
			System.out.println(this.b);
			this.b++;
		} while (this.b <= 10);
		 
	}
	
}