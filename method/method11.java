package method;

import java.util.Arrays;

//배열을 선언하는 방식 (실무)

public class method11 {
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		int arr2[] = new int[2];
		String data[] = new String[] {"KBS","SBS","MBC","JTBC","채널A"};
		
		load_data ld = new load_data();
		ld.aaa();
		ld.bbb();
		ld.ccc();
	}
}

class load_data{
	String info[] = null;	//해당 배열 변수 모든 메소드에서 활용할 수 있도록 설정
	
	public void aaa() {
		//필드에 선언된 배열 변수를 활용시 다음과 같이 적용하는 방식
		this.info = new String[] {"A","B","C"};	
	}
	public void bbb() {
		System.out.println(Arrays.toString(this.info));
	}
	//1차 원시배열 => 2차 원시배열로 결합
	public void ccc() {
		String area[] = {"서울","경기도","인천","대전"};
		String people[] = {"120000","6500","3200","500"};
		
		//2차 배열 크기
		/*
		[[서울, 120000], [경기도, 6500], [인천, 3200], [대전, 500]]
		*/
		//String total[][] = new String[area.length][2];
		
		/*
		[[서울, 경기도, 인천, 대전], [120000, 6500, 3200, 500]]
		*/
		String total[][] = new String[2][area.length];
				
		/* 1차배열을 2차배열로 변환시 반복문 1개로 설정하여 변환함 */
		int f;
		for(f = 0; f < area.length; f++) {
			/* 2차배열 1차 배열값을 알맞게 저장하는 공간 */
			total[0][f] = area[f];
			total[1][f] = people[f];
		}
		System.out.println(Arrays.deepToString(total));

	}
	
}
