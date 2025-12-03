package oop_class;

import java.util.ArrayList;

//외부 추상클래스 로드
public class ab2 extends abs_1 {
    public static void main(String[] args) {
	new ab2();	//외부 추상클래스에서 즉시실행 메소드를 발동
	new aabb();	//즉시실행 메소드가 없습니다. (abs_2.java)
    }
   @Override
   public String userinfo() {	//abs_2.java에 있는 추상 메소드를 로드함
   return null;
   }
    
   @Override
   protected void abs_main() { //abs_1.java에 있는 추상 메소드를 로드함
	this.arr = new ArrayList<Integer>();
	System.out.println("test");
   }
}

class aabb extends abs_2{	//abs_2.java에 있는 추상 클래스만 상속받음
   public aabb() {
       System.out.println(this.today());
   }
   @Override
   public String userinfo() {
        return null;
   }
   
}

class bbbs extends abs_1{
    @Override
    protected void abs_main() {
	String result = this.today();
	System.out.println("외부 클래스2 추가!!");
    }
    @Override
    public String userinfo() {
	return null;
    }
}

