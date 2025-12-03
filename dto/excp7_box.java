package dto;

import java.util.ArrayList;

//Model
public class excp7_box {

	//숫자 또는 문자를 검토하는 메소드
	public Integer user_check(String userkey) throws Exception {
		
		Integer n = 0;
		try {
			n = Integer.valueOf(userkey);
		}catch (Exception e) {
			n = null;
		}

		return n;
	}
	
	
	//Model - method(result) - 해당 6개의 배열 데이터를 연산처리 하는 메소드
	public void result(ArrayList<Integer> data) {
		System.out.println(data);
		/* 짝수, 홀수에 대한 결과값에 대한 문제집 : http://mekeyace.kbsn.or.kr/excp.txt */
	}
	 
}
