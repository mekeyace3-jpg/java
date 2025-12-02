package array;

import java.util.HashMap;
import java.util.Map;

//Map : 인터페이스 배열 키 오브젝트가 있는 배열 (HashMap, HashTable, TreeMap)
//Map은 key 이름은 중복시 에러가 발생할 수있음
public class array12 {
	public static void main(String[] args) {
		Map<String, String> all = new HashMap<String, String>();
		all.put("user", "박순수");
		all.put("area", "자양동");
		System.out.println(all);
		System.out.println(all.get("user"));
		all.put("user", "허대회");
		System.out.println(all);
		
		Map<String, Integer> data = new HashMap<String, Integer>();
		data.put("number", 5000);
		data.put("point", 60000);
		System.out.println(data);
		System.out.println(data.get("number"));	//get("키이름")
		data.remove("number");
		System.out.println(data);
		//찾고자 하는 키를 확인 : true, false
		System.out.println(data.containsKey("number"));
		System.out.println(data.keySet());  //해당 배열에 키 이름만 가져옴
		data.put("coupon", 50);
		System.out.println(data.size());  //Map size()는 키의 갯수
	}
}
