package oop_class;

import java.util.ArrayList;

public class inter_class1 {
    public static void main(String[] args) {
	new inter_box1().point();
    }
}
//interface를 직접 class 파엘에 사용하기 위해서는 implements 사용해야함

class inter_box1 implements inter1, inter2{
      
    @Override
    public String userid(String a, String b) {
        return null;
    }
    @Override
    public void point() {
	abc inter_abc = new abc();
	System.out.println(inter_abc.aaa);
	inter_abc.aaa = 60000;
	System.out.println(inter_abc.aaa);
    }
    @Override
    public Integer age() {
        return null;
    }

   @Override
   public String names(String aaa) {
    // TODO Auto-generated method stub
    return null;
   }
}
