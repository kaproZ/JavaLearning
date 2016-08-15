class Member{
	private int mid ;
	private String name;
	private Car car;// the people's car ,if null the people dont have
	
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
	public Car getCar(){
		return this.car;
	}
	public String getPname(){
		return this.pname;
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
		return"car is :"+this.pname;
	}
	public void setMebr(Member mber){
		this.mber = mber;
	}
	public Member getMebr(){
		return this.mber;
	}
}

public class TestDemo{
	public static void main(String[] args){
		Member mber = new Member(1,"John Snow");
		Member mber2 = new Member(2,"Amy");
		Car car = new Car("Doir");
		mber.setCar(car); //set relationship the people have a car
		car.setMebr(mber);//set relationship the car belong a person
		
		Car car1 = mber.getCar();
		Car car2 = mber2.getCar();
		System.out.println(mber.getInfo()+"\n"
								+car1.getInfo());
		System.out.println(mber2.getInfo()+"\n"
								+car2.getInfo());
	}
}