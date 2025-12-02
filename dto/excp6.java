package dto;
//throws, throw 모두 사용
public class excp6 {
	public static void main(String[] args) {
		try {
			new excp6_box().abc("ok");
		}catch (Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
				a.printStackTrace();
				System.out.println("코드 오류가 발생 하였습니다.");
			}
		}
	}
}

