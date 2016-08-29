class Outer{
	private String msg = "Hello";
	public Outer(){
		System.out.println("Outer"+msg);
	}
	static class Inner{
		public Inner(){
			msg +="daad";
			System.out.println("Inner"+msg);	
		}
		
	}
	public void fun(){
		new Inner();
	}
}
public class TestDemo{
	public static void main(String[] args){
		new Inner();
		new Inner();
	}
}