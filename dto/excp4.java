package dto;
//Throws 
public class excp4 {
	public static void main(String[] args){
		try {
			new excp4_box().abc(1000,"5000");	//해당 클래스에 abc라는 메소드를 선언과 동시에 실행
		}
		catch (Exception e) {
			System.out.println("박순수 : " + e);
			e.printStackTrace();
		}
	}
}
/*
throws Exception : 외부 클래스에서 무조건 try~catch를 사용 해야함 또한 받는 데이터값이 잘못 되었을 경우
                   외부 클래스에서 보내준 값이 잘못 되었다고 외부 catch 반환함
*/
class excp4_box{
	public void abc(Integer no, String z) throws Exception,NumberFormatException {
		try {
			int sum = no + Integer.parseInt(z);
			System.out.println(sum);
			//String sum2 = no + String.valueOf(z);
			//int test = Integer.parseInt(sum2) / 2;
			//System.out.println(test);
		}catch (Exception e) {
			System.out.println("김동완:" + e);
		}
	}
}