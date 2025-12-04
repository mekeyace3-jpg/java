package oop_class;
//interface의 기본은 public
public interface inter1 {
    public String data[] = {"",""};
    
    //static + final
    Integer point = 1000;	//상수
    String domain = "abc.co.kr"; 
    //public static final Integer no = 50000;
    
    //interface 안에 class를 활용하여 외부에서 해당 변수값 및 자료형을 로드할 수 있음 
    class abc{
	Integer aaa = 500;	//일반 class 처럼 필드 값
    }
      
    /* interface에 선언한 메소드는 class 상속 받을 경우 무조건 Override 적용됨 */
    public String names(String aaa);
    public Integer age();
    public String userid(String a, String b);
    
    //default : interface에서 유일하게 기본 메소드를 활용할 수 있는 선언문 (필
    default void setbox(String id) {
	System.out.println(id);
    }
}
