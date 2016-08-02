class Emp {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private static int objn;
	public Emp(){
		
	}
	public Emp(int n,String e,String j,double s,double c){
		this.empno = n;
		this.ename = e;
		this.job = j;
		this.sal = s;
		this.comm = c;
	}
	public static int ObjectNum()
	{
		return objn +1;
	}
	//empno
	public void setEmpno(int n){
		this.empno = n;
	}
	public int getEmpno(){
		return this.empno;
	}
	//ename
	public void setEname(String s){
		this.ename = s;
	}
	public String getEname(){
		return this.ename;
	}
	//job
	public void setJob(String s){
		this.job = s;
	}
	public String getJob(){
		return this.job;
	}
	//sal
	public void setSal(double p){
		this.sal = p;
	}
	public double getSal(){
		return this.sal;
	}
	//comm
	public void setComm(double p){
		this.comm = p;
	}
	public double getComm(){
		return this.comm;
	}
	
	//info
	public String getInfo(){
		return "This emp's"+"\n"+
					"  No: "+empno+"\n"+
					"name: "+ename+"\n"+
					 "Job: "+job+"\n"+
					 "Sal: "+sal+"\n"+
					"Comm: "+comm;
	} 
}
//Test
public class TestDemo{
	public static void main (String args[]){
		Emp em = null;
		em = new Emp(1,"John Snow","QA",5000.0,1000.0);
		Emp emc = null;
		emc = em;
		System.out.println(emc.getInfo());
		em.setEname("Ashay");
		System.out.println(emc.getEname());
		Emp em2 = new Emp(2,"John Snow","QA",5000.0,1000.0);
		System.out.println(Emp.ObjectNum());
	}
}
