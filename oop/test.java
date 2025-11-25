package oop;

public class test {

	public static void main(String[] args) {
		aaa a = new aaa();
		a.abc();
	}

}

class aaa{
	int box = 1000;
	
	public void abc() {
		String box = "500";
		System.out.println(box);
	}
	
}