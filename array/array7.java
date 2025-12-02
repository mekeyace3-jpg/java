package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 클래스배열 응용편1 */
/* http://mekeyace.kbsn.or.kr/java_arr2.txt    */
public class array7 {
	public static void main(String[] args) {
		Integer data[] = {10,16,9,7,31,45,27,94,86,87,112,100,3};
		array7_box ab = new array7_box();
		ab.aaa(data);
	}
}
class array7_box{
	ArrayList<Integer> all = null;	//객체명만 사용
	
	public void aaa(Integer b[]) {
		//System.out.println(Arrays.toString(b));
		this.all = new ArrayList<Integer>();	//new 숫자 배열 생성
		for(Integer c : b) {	//foreach 배열 전용 반복문
			//System.out.println(c);
			if(c % 2 == 1) {
				this.all.add(c);
			}
		}
		
		Collections.sort(this.all);	//Collections : 클래스배열 정렬
		//Collections.sort(this.all,Collections.reverseOrder());
		System.out.println(this.all);
		
	}
	
}

