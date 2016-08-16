class Member{
	private int mid ;
	private String name;
	private Car car;// the people's car ,if null the people dont have
	private Member child;
	private Member father;
	
	public Member(int mid,String name){
		this.mid = mid;
		this.name = name;
	}
	public String getInfo(){
		return "ID:"+this.mid+"\t"+"NAME:"+this.name;
	}
	//the relationship
	public void setCar(Car car){
		this.car = car;
	}
	
	// only get carInfo
	public String getCarInfo(){
		if(this.car==null){
			return"He dont have any car!";
		}
		return "Car:"+this.car.getInfo();
	}
	public void setChild(Member child){
		this.child = child;
	}
	public String getChildInfo(){
		if(this.child==null){
			return "He dont have child!";
		}
		else
			return "Child: "+this.child.getInfo();
	}
	public void setFather(Member father){
		this.father = father;
	}
	public String getFatherInfo(){
		if(this.father==null){
			return "He dont know who is his father!";
		}
		else
			return "Father:"+this.father.getInfo();
	}
}
class Car{
	//private int cid;
	private String pname;
	private Member mber;
	
	public Car(String pname){
		this.pname=pname;
	}
	public String getInfo(){
		return"car's name:"+this.pname;
	}
	public void setMebr(Member mber){
		this.mber = mber;
	}
	// only get mberInfo
	public String getMebrInfo(){
		if(this.mber==null)
		{
			return "This car is selling!wecome to visit!";
		}
		else
		return "The car's belong "+this.mber.getInfo();
	}
}

public class TestDemo{
	public static void main(String[] args){
		Member mber = new Member(1,"John Snow");
		Member mber2 = new Member(2,"Amy");
		Car car = new Car("Audi");
		mber.setCar(car); //set relationship the people have a car
		car.setMebr(mber);//set relationship the car belong a person
		
		mber.setChild(mber2);
		mber2.setFather(mber);
		mber2.setCar(car);
		
		System.out.println("**********Person************");
		System.out.println(mber.getInfo());
		System.out.println(mber.getCarInfo());
		System.out.println("**********Car************");
		System.out.println(car.getInfo());
		System.out.println(car.getMebrInfo());
		System.out.println("**********ChildInfo************");
		System.out.println(mber.getChildInfo());
		System.out.println("**********FatherInfo************");
		System.out.println(mber2.getFatherInfo());

	}
}