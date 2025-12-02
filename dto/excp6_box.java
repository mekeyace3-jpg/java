package dto;

class excp6_box{
	Exception ep = null;
	public void abc(String a) throws Exception{
		try {		//정상적으로 처리가 되었을 경우 null 처리가 됨
				if(a == "ok") {
					String key = "134aaa";
					int keycode = Integer.parseInt(key);		//오류가 발생
					System.out.println(keycode);
				}
				else if(a == "no") {
					System.out.println("정상적으로 처리 완료!!");
				}
		}
		catch(Exception e) {
			
			this.ep = new Exception(e); //=> null 아닌 문제 사항이 발생됨
			throw this.ep;	//자신을 호출한 메소드에 결과값을 전송
		
			//throw e;	//return 시켜서 오류 확인
		}
	}
	
}