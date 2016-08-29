class A{
	private static int count; 
	public A(){
		this.count++;
		System.out.print(A.getCount());
	}
	static public int getCount(){
		return count;
	}
}
public class Test{
	public static void main(String[] args){
		new A();
		new A();
		new A();
		
	}
}