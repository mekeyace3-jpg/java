package ex;

import java.util.Arrays;

public class ex7 extends ex7_class{
    @Override	//해당 메소드는 직접 상속 받아서 필수조건으로 사용하는 메소드
    public void box() {
         System.out.println(Arrays.toString(this.data));
         String result = this.box3();
         System.out.println(result);
    }
    public String box3() {	//Overloading : 직접 개발자가 상속 외에 추가 메소드를 생성한 경우
	this.search = "검색에서 사용하는 변수";
	return this.search;
    }
    
    public static void main(String[] args) {
	new ex7().box();
    }
}

abstract class ex7_class{
    String data[] = {"빨간색","파란색","노란색"};
    String search = null;
    public abstract void box();	//추상 메소드
    
    //추가 추상 메소드를 생성하더라도 기존 작동되는 class에서 문제가 되지는 않음
    public abstract String rebox();	
    public void box2() {};	//일반 메소드
    
}