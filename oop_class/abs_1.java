package oop_class;

import java.util.List;
/*
 추상 클래스에서는 protected, public, default에 대한 메소드만 생성 가능합니다.
*/
public abstract class abs_1 extends abs_2 {
    List<Integer> arr = null;
    final String mid = "apink";
    
    public abs_1(){
	this.abs_main();
    };	//즉시실행 메소드는 abstract 사용하지 못함
  
    protected abstract void abs_main();	//무조건 처음 시작하는 메소드
}
