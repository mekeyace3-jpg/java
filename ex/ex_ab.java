package ex;

import java.util.ArrayList;

//무조건 해당 추상 클래스는 외부 클래스에 상속 형태로만 운영됩니다.
public abstract class ex_ab {
    ArrayList<String> subject = null;
    
    public ex_ab() {	//추상 클래스에서 construct를 구현하면 상속시 즉시 발동되는 메소드
	
    }
    
    public abstract void add_subject(String word);
    public abstract void del_subject(String word);
    public abstract void all_subject();
}
