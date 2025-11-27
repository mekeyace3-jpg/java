package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//원시배열 -> 클래스 배열 이관 후 정렬
public class array3 {

	public static void main(String[] args) {
		Integer data[] = {3,1,6,5,9,11,16,12,4};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(data));
		//Collections : 라이브러리 클래스를 활용하여 데이터를 정렬 할 수 있음
		System.out.println(al);
		Collections.sort(al);	//오름차순으로 정렬
		System.out.println(al);  
		Collections.sort(al,Collections.reverseOrder());	//내림차순으로 정렬
		System.out.println(al);
		
		String user[] = {"허대회","신범석","권하민","김고운","박순수","김동완","김예빈"};
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(user));
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
		
		ArrayList<Long> all = new ArrayList<Long>();
		long w = 0L;
		while(w < 1000000) {
			all.add(w);
			w++;
		}
		System.out.println(all);
	}

}
