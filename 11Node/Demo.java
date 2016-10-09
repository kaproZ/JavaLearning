class Book{
	private String title;
	private double price;
	public Book(String title,double price){
		this.title = title;
		this.price = price;
	}
	public String getInfo(){
		return "bNAME:"+this.title+
		"\tbPrice:"+this.price;
	}
}
class Link{
	private Node root;
	private int length;
	private int index;
	class Node{
		private Book book;
		private Node next;
		
		public Node(Book book){
			this.book = book;
		}
		public void setNext(Node node){
			this.next =node;
		}
		public void setBook(Book book){
			this.book = book;
		}
		public boolean addNode(Node node){
			if(this.next == null){
				this.next =node;
				return true;
			}
			else return this.next.addNode(node);
		}
		public void printNode(){
			if(this !=null){
				System.out.println(this.book.getInfo());
			}
			if(this.next !=null){
				this.next.printNode();
			}
			else
				return;
			
		}
		public boolean insertNode(int index,Node node){
			if(index == 2){
				node.next = this.next;
				this.next =node;
				return true;
			}
			else return this.next.insertNode(--index,node);
		}
		public int isNode(Book book,int index){	
			
			if(this.book == book){
				return index;
			}
			if(this.next !=null){
				return this.next.isNode(book,++index);
			}
			else
				return -1;
		}
		public boolean deleteNode(int index){
			if(index ==1){
				if(this.next.next==null){
					this.next =null;
					return true;
				}
				else{
					this.next =this.next.next;
					return true;
				}
			}
			else return this.next.deleteNode(--index);
		}

	}
	public Node getRoot(){
		return this.root;
	}
	//ÃÌº”
	public boolean add(Book book){
		Node node =new Node(book);
		if(root==null){
			this.root = node;
			return true;
		}
		else return this.root.addNode(node);
			
	}
	//¥Ú”°
	public void print(){
		if(this.root==null){
			System.out.println("This Link is empty!");
		}
		else this.root.printNode();
	}
	//≤Â»Î
	public boolean insert(int index,Book book){
		Node node =new Node(book);
		if(index <2){
			node.next =root;
			root = node;
			return true;
		}
		else return this.root.insertNode(index,node);
	}
	public int isFind(Book book){
		if(this.root == null){
			return -1;
		}
		else
			return this.root.isNode(book,this.index);
	}
	public boolean delete(Book book){
		if(this.root == null){
			return false;
		}
		if(this.isFind(book)!=0){
			return this.root.deleteNode(this.isFind(book));
		}
		if(this.isFind(book)==0){
			this.root =this.root.next;
			return true;
		}
			return false;
		
	}

	
}
public class Demo{
	public static void main(String[] args){
		Link link = new Link();
		Book book1 = new Book("JavaBook",88.9);
		Book book2 = new Book("PythonBook",78.9);
		Book book3 = new Book("JSBook",59.3);
		link.add(book1);
		link.add(book2);
		link.insert(3,book3);
		link.print();
		
		System.out.println(link.isFind(book1));
		System.out.println(link.isFind(book2));
		System.out.println(link.isFind(book3));
		link.delete(book1);
		link.print();
	}
}