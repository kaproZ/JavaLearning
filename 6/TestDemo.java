public class TestDemo{
	public static void main(String[] args){
		String msg = "HelloWorld";
		func(msg);
		System.out.print(msg);
		
	}
	public static void func(String temp){
		temp = "World";
	}
}