package array;
//추가 자료형 및 형 변환 방법
public class array1 {
	public static void main(String[] args) {
		String a = "1000";		//문자 자료형
		Integer b = Integer.valueOf(a);	//Integer.valueOf => 문자 자료형을 숫자로 변환
		//int b = Integer.parseInt(a);	//int 자료형 => 문자 자료형을 숫자로 변환
		System.out.println(b);
		
		int c = 123456;		//숫자 자료형 
		//Integer c = 123456;
		
		/* String.valueOf : 만약 0으로 시작하는 숫자일 경우 8진수 형태로 간주 */
		String d = String.valueOf(c);	//String.valueOf => 숫자 자료형을 문자로 변환
		System.out.println(d);
		
		int aa = 0;		//int : 0 부터만 사용가능 (null X)
		Integer bb = null;		//Interger (숫자 클래스) : null을 사용할 수 있음
		System.out.println(bb);
		//int sum = aa + bb;
		//System.out.println(sum);
		
		Object ff = 123456;
		String zz = ff.toString();	//(toString) => 변환하고자 하는 데이터 자료형 Object
		System.out.println(zz);
		
		int kk = 123456;
		String kkk = Integer.toString(kk);	//Integer.toString => 숫자를 문자로 변환
		System.out.println(kk);
		System.out.println(kkk.getClass());	//getClass() : 클래스 자료형 Type 확인
		
	}
}
