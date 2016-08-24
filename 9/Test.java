class Province{
	int pid;
	String pname;
	City[] cities;
	public Province(int pid,String pname){
		this.pid = pid;
		this.pname = pname;
	}
	public void setCities(City[] cities){
		this.cities = cities;
	}
	public City[] getCities(){
		return this.cities;
	}
	public String getInfo(){
		return "Province\t|-PID:"+this.pid+"\tNAME:"+pname;
	}
	
}
class City{
	int cid;
	String cname;
	Province pro;
	public City(int cid,String cname){
		this.cid = cid;
		this.cname = cname;
	}
	public void setPro(Province pro){
		this.pro = pro;
	}
	public Province getPro(){
		return this.pro;
	}
	public String getInfo(){
		return "City\t|-CID:"+cid+"\tNAME:"+cname;
	}
}
public class Test{
	public static void main(String[] args){
		Province pro = new Province(1,"HUNAN");
		City city1 = new City(1001,"changsha");
		City city2 = new City(1002,"zhuzhou");
		City city3 = new City(1003,"xiangtan");
		City city4 = new City(1004,"hengyang");
		City city5 = new City(1005,"yongzhou");
		City[] cities = new City[]{city1,city2,city3,city4,city5};
		pro.setCities(cities);
		city1.setPro(pro);
		city2.setPro(pro);
		city3.setPro(pro);
		city4.setPro(pro);
		city5.setPro(pro);
		System.out.println(city1.getPro().getInfo());
		for(int i = 0;i<cities.length;i++){
			System.out.println(pro.getCities()[i].getInfo());
		}
		
		
	}
}