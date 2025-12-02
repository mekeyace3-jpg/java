package dto;
//http://mekeyace.kbsn.or.kr/product_arr.txt

import java.util.*;
/*
 DTO 없이 사용하는 코드 
*/
public class ex1 {
	public static void main(String[] args) {
		ex1_box ex = new ex1_box();
	}
}

class ex1_box{
	Scanner sc = null;
	List<String> al = null;		//1차 배열 구성
	ArrayList<List<String>> all = null;	//2차 배열 구성
		
	String product[][] = {
			{"솔브리빙 논슬립 내구성 좋은 고급형 옷걸이","Y","37000","30400","17","250"},
			{"코끼리리빙 문걸이 전신거울","Y","265740","258120","2","310"},
			{"리빙스타 스탠드 행거 트리","Y","46700","35900","23","16"},
			{"스피드랙 업그레이드형 홈던트하우스 철제 선반","N","35900","","","33"},
			{"보노하우스 슬림서랍장 4단","N","30400","","","70"},
			{"보노하우스 맥스 서랍장 2단","Y","141000","54900","61","120"},
			{"스피드랙 업그레이드형 홈던트하우스 철제 선반 3단","Y","144160","132740","7","44"},
			{"스피드랙 업그레이드형 홈던트하우스 조립식 행거","N","30400","","","57"},
			{"리빙스타 모던 스탠드 행거 화이트","Y","29900","23900","20","314"}
	};
	public ex1_box() {
		this.sc = new Scanner(System.in);
		this.all = new ArrayList<List<String>>();	//2차 배열
		
		//원시배열 => 1차배열 => 2차배열
		int f;
		for(f = 0; f < this.product.length; f++) {
			this.al = new ArrayList<String>(Arrays.asList(product[f]));
			this.all.add(this.al);
		}
		this.abc();
	}
	public void abc() {
		//System.out.println(this.all);
		//System.out.println(this.all.get(4).get(2));  //2차 클래스에서 해당 그룹에서 데이터를 출력
		
		System.out.println("검색할 상품명을 입력하세요 (종료:exit) : ");
		String pdnm = this.sc.nextLine(); //nextLine : 스페이스바를 입력 후 적용된 단어도 포함
	    
		if(pdnm.equals("exit")) {
			System.out.println("프로세서 종료");
			this.sc.close();
			System.exit(0);
		}
		
		//2차 클래스에 있는 그룹단위별로 반복문을 이용하여 데이터를 검토하는 코드
		boolean ck = false;	//검색시 해당 상품명이 없을 경우
		int ff;
		for(ff = 0; ff < this.all.size(); ff++) {
			if(this.all.get(ff).get(0).equals(pdnm)) {
				ck = true;
				if(this.all.get(ff).get(1) == "Y") {	//할인이 적용된 상품
					this.sales(ff);
				}
				else {	//미할인 상품
					this.nosales(ff);
				}
			}		
		}
		//배열 클래스에 반복문으로 검토 하였을 경우 동일한 상품이 없을 경우
		if(ck == false) {
			System.out.println("해당 검색된 상품이 없습니다.");
		}
		this.abc();
	}
	
	String msg = null;
	public void sales(int groupno) {
		this.msg = "상품명 : " + this.all.get(groupno).get(0) + "\n";
		this.msg += "상품가격 : " + this.all.get(groupno).get(2) + "\n";
		this.msg += "할인가격 : " + this.all.get(groupno).get(3) + "\n";
		this.msg += "추천수 : " + this.all.get(groupno).get(4) + "\n";
		this.msg += "수량 : " + this.all.get(groupno).get(5) + "\n";
		System.out.println(this.msg);
	}
	public void nosales(int groupno) {
		this.msg = "상품명 : " + this.all.get(groupno).get(0) + "\n";
		this.msg += "상품가격 : " + this.all.get(groupno).get(2) + "\n";
		this.msg += "수량 : " + this.all.get(groupno).get(5) + "\n";
		System.out.println(this.msg);
	}
	
	
}
