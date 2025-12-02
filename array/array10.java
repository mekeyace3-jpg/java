package array;

import java.util.ArrayList;
import java.util.Arrays;

//2차 클래스배열 => 1차 클래스배열 => 데이터를 추가하는 형태
public class array10 {

	public static void main(String[] args) {
		Integer a[][] = {
				{10,20,30},		//0
				{100,200,300}	//1
		};
		
		//2차 클래스
		ArrayList<ArrayList<Integer>> all  = new ArrayList<ArrayList<Integer>>();
		
		/*
		int f,ff;
		for(f=0; f<a.length; f++) {	//2
			//1차 클래스
			ArrayList<Integer> al = new ArrayList<Integer>();	//반복문이 작동하면서 초기화가 되도록 하는 형태
			
			for (ff=0; ff<a[0].length; ff++){
				al.add(a[f][ff]);	//원시배열에서 1차 클래스로 값을 전달
			}
			all.add(al);	//1차 클래스 배열값을 2차 클래스 배열로 삽입
		}
		
		System.out.println(all);// [[],[]]
		*/
		
		/* 실무환경 원시배열 => 클래스 배열로 변환 */
		int f;
		for(f=0; f<a.length; f++) {
			ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a[f]));
			all.add(al);
		}
		System.out.println(all);	
		
		array10_box ab = new array10_box();
		//ab.aaa();
		//ab.bbb();
		ab.ccc();
	}
}

/*
 응용문제1.
 해당 원시배열의 데이터 중 포인트가 2000 이상인 고객 정보만 2차배열로 저장되도록 코드를
 작성하시오.
 
 {
 	{"권하민","김고운","김동완","김예빈"},
    {1000,1500,2200,3300},
    {"A형","AB형","B형","O형"}
 }
 
 [결과]
 [[김동완,김예빈],[2200,3300],[B형,O형]]
*/
class array10_box{
	private Object data[][] =  {
		 	{"권하민","김고운","김동완","김예빈"},
		    {1000,1500,2200,3300},
		    {"A형","AB형","B형","O형"}
	};
	private ArrayList<ArrayList<Object>> all = null;
	private ArrayList<Object> al = null;
	
	public void ccc() {
		this.all = new ArrayList<ArrayList<Object>>();
		int w = 0;
		while(w < this.data.length) {	//3
			//포인트가 2000점 이상 일때
				this.al = new ArrayList<Object>();
				int ww = 0;
				while(ww < this.data[0].length) {	//4 고객명,포인트,혈액형
					if(Integer.parseInt(this.data[1][ww].toString()) >= 2000) {
						System.out.println(this.data[w][ww]);
						this.al.add(this.data[w][ww]);
					}
					ww++;
				}
				this.all.add(this.al);
			w++;
		}
		System.out.println(this.all);
	}
	
	
	public void bbb() {
		this.all = new ArrayList<ArrayList<Object>>();	//2차 빈배열
		int f;
		for(f=0; f<this.data[0].length; f++) {	//데이터 갯수
			
			//배열기준 1번 그룹의 값을 조건문에 체크
			this.al = new ArrayList<Object>();	//1차 빈배열
			if(Integer.parseInt(this.data[1][f].toString()) >= 2000) {
				this.al.add(this.data[0][f]);
				this.al.add(this.data[1][f]);
				this.al.add(this.data[2][f]);
				this.all.add(this.al);
			}
		}
		System.out.println(this.all);
		
	}
	
	
	
	public void aaa() {
		//Object 배열은 문자로 변환 후 숫자로 검토를 하는 형태 구조를 적용해야만 사용 가능함
		Object a[] = {"문자",23,"test@nate.com"};
		//System.out.println(a[1].getClass());
		System.out.println(Arrays.toString(a));
		if(a[2].equals("test@nate.com")) {
			System.out.println("정상적인 이메일");
		}
		
		/*//숫자 검토시 주의사항
		if(Integer.parseInt(a[1].toString()) > 25) {	
			System.out.println(a[0]);
		}
		*/
	}
	
}

