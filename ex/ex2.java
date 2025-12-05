package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
	String word = "1,2,3,4,5";
	String arr[] = word.split(",");	//단어 기준으로 배열화
	System.out.println(Arrays.toString(arr));
	
	//replace : 문자를 다른 단어로 변경 (찾을단어,변경할 단어)
	String address = "서울 특별시 마포구 마포동";
	String result = address.replace("마포", "mapo");
	System.out.println(result);

	String code = "010abcd12K4";
	String result2 = code.replaceAll("[a-zA-Z]", "*");
	System.out.println(result2);
	
	String name = "shin범식";
	String result3 = name.replaceAll("[ㄱ-ㅎㅏ-ㅣ가-힣]", "");
	System.out.println(result3);
	
	//^ : 부정을 말하여 해당 배열 외에 단어를 말함
	String id = "홍吉dong※";
	String result4 = id.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(result4);
	
	//boxing, unboxing 속도
	long start = System.currentTimeMillis();
	//long sum = 0L;
	Long sum = 0L;
	for(long i=0; i<10000000; i++) {
	    sum += i;
	}
	long end = System.currentTimeMillis();
	System.out.println(end-start);
	
	//Integer.valueOf(0);
	//Integer.parseInt();
	
	int no = 55;
	//String munja = String.valueOf(no);
	String munja = Integer.toString(no);
	System.out.println(munja);
	
    }
}
