class Message{
	private int num = 10;
	public Message(int num){
		this.num = num;
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return this.num;
	}
	
}
public class Demo{
	
	public static void main (String[] args){
		Message msg = new Message(30);
		func(msg);//���ô���
		System.out.print(msg.getNum());
	}
	public static void func(Message temp){
		msg.setNum(20);//����Ϊʲô������this
	}
}