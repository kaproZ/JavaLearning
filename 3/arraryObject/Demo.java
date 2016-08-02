class Book{
	private String title ;
	private double price;
	
	//无参构造方法
	public Book(){
		
	}
	//有参构造方法
	public Book(String title){
		this.title=title;
	}
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	
	
	//setter、getter方法
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
		return("书名："+this.title+"\n"+
			   "价格: "+this.price );
	}
}
public class Demo{
	public static void main(String args[]){
		//开辟长度为3的对象数组
		//动态初始化
		Book[] bks = new Book[3];//这是new 的时候开辟内存了吗？开辟了在堆内存中，思考下二级引用的关系
		System.out.println("bks:"+bks+"\t"+
							"bks[0]:"+bks[0]+"\t"+
							"bks[1]"+bks[1]+"\t"+
							"bks[2]"+bks[2]);
		//一次引用为bks 到数组，一次数组到对象
		
		//对象数组分别初始化
		bks[0] = new Book("JAVA",89.9);
		bks[1] = new Book("C",100.0);
		bks[2] = new Book("python",29.9);
		
		//静态初始化
		
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
	
	//打印对象数组
	public static void print(Book[] book){
		for(int i =0;i<book.length;i++)
		{
			System.out.println(book[i].getInfo());
		}
	}
}