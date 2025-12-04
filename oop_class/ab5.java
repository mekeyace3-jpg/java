package oop_class;
//상품등록 페이지 프로세서
/*
 abs_3.java를 상속시켜서 상품등록 페이지를 제작 합니다.
 
 [실행]
 "상품명을 입력하세요 : "
 "상품가격을 입력하세요 : "
 "할인율을 입력하세요 : "
 
  [출력]
  [냉장고,30000,10,27000,2025-12-04]
 */
public class ab5 {
    public static void main(String[] args) {
	//할인율 적용하는 코드
	int money = 50000;	//판매금액
	double sales = 15;	//할인율
	double a = sales / 100;
	int sales_money = (int)(money * a);
	int sum = money - sales_money;	//할인금액
	System.out.println(sum);
	
	int total = money - (int)(money * ((double)sales / 100));
	System.out.println(total);
    }
}
