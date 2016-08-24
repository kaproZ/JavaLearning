class Item{
	private int iid;
	private String name;
	private String note;
	private Subitem[] items;
	private Product[] products;
	public Item(int iid,String name,String note){
		this.iid = iid;
		this.name = name;
		this.note = note;
	}
	public String getInfo(){
		return "Item ID:"+this.iid+
		"\tNAME:"+this.name+
		"\tNOTE:"+this.note;
	}
	public void setSubItems(Subitem[] items){
		this.items = items;
	}
	public Subitem[] getSubItems(){
		return this.items;
	}
	public void setProducts(Product[] products){
		this.products = products;
	}
	public Product[] getProducts(){
		return this.products;
	}
}
class Subitem{
	private int sid;
	private String name;
	private String note;
	private Item item;
	private Product[] products;
	public Subitem(int sid,String name,String note){
		this.sid = sid;
		this.name = name;
		this.note = note;
	}
	public String getInfo(){
		return "Subitem ID:"+this.sid+
		"\tNAME:"+this.name+
		"\tNOTE:"+this.note;
	}
	public void setItem(Item item){
		this.item = item;
	}
	public Item getItem(){
		return this.item;
	}
	public void setProducts(Product[] products){
		this.products = products;
	}
	public Product[] getProducts(){
		return this.products;
	}
}
class Product{
	private int pid;
	private String name;
	private double price;
	private Subitem subitem;
	public Product(int pid,String name,double price){
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	public String getInfo(){
		return "Product ID:"+this.pid+
		"\tNAME:"+this.name+
		"\tPRICE:"+this.price;
	}
	public void setSubItem(Subitem subitem){
		this.subitem = subitem;
	}
	public Subitem getSubItem(){
		return this.subitem;
	}
}
public class TestISP{
	public static void main(String[] args){
		Item item = new Item(1,"IT","ÖØµã");
		Subitem subJ = new Subitem(10001,"JAVA","hot");
		Subitem subP = new Subitem(10002,"Python","new");
		
		item.setSubItems(new Subitem[]{subJ,subP});
		
		subJ.setItem(item);
		subP.setItem(item);
		
		Product proJ = new Product(10001001,"JAVAOneDay",99.9);
		Product proJ2= new Product(10001001,"AndroidOneDay",60.0);
		Product proP = new Product(10001001,"PythonEasy",99.9);
		Product proP2= new Product(10001001,"PythonHard",199.9);
		
		subJ.setProducts(new Product[]{proJ,proJ2});
		subP.setProducts(new Product[]{proP,proP2});
		proJ.setSubItem(subJ);
		proJ2.setSubItem(subJ);
		proP.setSubItem(subP);
		proP2.setSubItem(subP);
		
		System.out.println("*********Product->item************");
		System.out.println(proJ.getInfo());
		System.out.println(proJ.getSubItem().getItem().getInfo());
		System.out.println("*********subitem->item************");
		System.out.println(subP.getInfo());
		System.out.println(subP.getItem().getInfo());
		System.out.println("*********item->subitems************");
		System.out.println(item.getInfo());
		for(int i = 0;i<item.getSubItems().length;i++){
			System.out.println(item.getSubItems()[i].getInfo());
		}
		System.out.println("*********subitem->products************");
			System.out.println(subP.getInfo());
		for(int i = 0;i<subP.getProducts().length;i++){
			System.out.println(subP.getProducts()[i].getInfo());
		}
		System.out.println("*********item->products************");
		System.out.println(item.getInfo());
		for(int i = 0;i<item.getSubItems().length;i++){
			System.out.println(item.getSubItems()[i].getInfo());
			for(int j = 0;j<item.getSubItems()[i].getProducts().length;j++){
				System.out.println(item.getSubItems()[i].getProducts()[j].getInfo());
			}
		}
	}
}