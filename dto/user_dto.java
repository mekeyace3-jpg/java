package dto;
//사용자 정보 및 로그인 파트 (DTO) - 데이터를 전달 및 반환하는 역활의 class
//VO - get(return 메소드가 없음) - set 메소드만 있음

import java.util.ArrayList;

//DTO - setter(값을 받는 역활), getter(값을 반환 역활)
public class user_dto {
	private String usernm, userid, userpw;
	private int userage;
	private String userem;
	
	public String getUserem() {
		return userem;
	}
	public void setUserem(String userem) {
		this.userem = userem;
	}
	public String getUsernm() {
		return usernm;
	}
	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	//1차 배열을 생성하여 반환 메소드
	public ArrayList<Object> users(){ //2차 클래스에 반환하는 메소드
		ArrayList<Object> u = new ArrayList<Object>();
		//getter 형태로 1차 배열에 값을 추가하는 코드
		u.add(getUserid());
		u.add(getUsernm());
		u.add(getUserpw());
		u.add(getUserage());
		return u;	//1차배열을 2차 배열에 사용할 수 있도록 반환작업
	}
	
	public ArrayList<ArrayList<Object>> all_users(){
		
		return null;
	}
}
