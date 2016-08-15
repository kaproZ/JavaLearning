class A {
	private B b;
	public A(){
		this.b = new B(this);
		this.b.get();
	}
	public void print() {
		System.out.println("Helloworld!!!");
	}
}
class B{
	private A a;
	public B(A a){
		this.a =a;
	}
	public void get(){
		this.a.print();
	}
}
public class Demo{
	public static void main(String[] args){
		A temp = new A();
	}
}