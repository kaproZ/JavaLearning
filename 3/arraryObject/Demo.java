class Book{
	private String title ;
	private double price;
	
	//�޲ι��췽��
	public Book(){
		
	}
	//�вι��췽��
	public Book(String title){
		this.title=title;
	}
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	
	
	//setter��getter����
	public void setTitle(String t){
		this.title = t;
	}
	public String getTitle(){
		return this.title;
	}
	public void setPrice(double p){
		this.price = p;
	}
	public double getPrice(){
		return this.price;
	}
	
	//getInfo
	public String getInfo(){
		return("������"+this.title+"\n"+
			   "�۸�: "+this.price );
	}
}
public class Demo{
	public static void main(String args[]){
		//���ٳ���Ϊ3�Ķ�������
		//��̬��ʼ��
		Book[] bks = new Book[3];//����new ��ʱ�򿪱��ڴ����𣿿������ڶ��ڴ��У�˼���¶������õĹ�ϵ
		System.out.println("bks:"+bks+"\t"+
							"bks[0]:"+bks[0]+"\t"+
							"bks[1]"+bks[1]+"\t"+
							"bks[2]"+bks[2]);
		//һ������Ϊbks �����飬һ�����鵽����
		
		//��������ֱ��ʼ��
		bks[0] = new Book("JAVA",89.9);
		bks[1] = new Book("C",100.0);
		bks[2] = new Book("python",29.9);
		
		//��̬��ʼ��
		
		Book[] books = new Book[]{
			new Book("JAVA_static",89.9),
			new Book("C",100.0),
			new Book("python",29.9)};
		
		
		print(bks);
		print(books);
		System.out.println("bks:"+bks+"\t"+
							"bks[0]:"+bks[0]+"\t"+
							"bks[1]"+bks[1]+"\t"+
							"bks[2]"+bks[2]);
							int 
	}
	
	//��ӡ��������
	public static void print(Book[] book){
		for(int i =0;i<book.length;i++)
		{
			System.out.println(book[i].getInfo());
		}
	}
}