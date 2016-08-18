class Dept{
	private int deptno;//*
	private String dname;//*
	private String loc;
	private Emp[] emps;//对象数组
	
	public Dept(int deptno,String dname,String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	//对象数组setter
	public void setEmps(Emp[] emps){
		this.emps = emps;
	}
	//对象数组getter
	public Emp[] getEmps(){
		return this.emps;
	}
	public String getInfo(){
		if(this!=null){
			return "Dept_NO："+this.deptno+
		", Dept_NAME："+this.dname+", Loc: "+this.loc;
		}
		return "NO exit!!";
		
	}
}
class Emp{
	private int empno;//*
	private String ename;//*
	private String job;//*
	private int sal;//*
	private String comm;
	private Emp mgr;
	private Dept dept;
	
	
	// public Emp(int empno,String ename){
		// this.empno = empno;
		// this.ename = ename;
	// }
	public Emp(int empno,String ename,String job,int sal){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	public void setDept(Dept dept){
		this.dept = dept;
	}
	public Dept getDept(){
		return this.dept;
	}
	public void setMgr(Emp mgr){
		this.mgr = mgr;
	}
	public Emp getMgr(){
		return this.mgr;
	}
	public String getInfo(){
		if(this !=null){
			return "Emp_NO: "+this.empno+
		", Emp_NAME:　"+this.ename+
		", Emp_Job: "+this.job+
		", Emp_Sal: "+this.sal;
		}
		return "NO exit!!";
	}
}
public class DemoTest{
	public static void  main(String[] args){
		//初始化独立的数据
		Dept dept = new Dept(1,"QA","changsha");
		Dept d = null;
		Emp emp = new Emp(10001,"Joh","AutoTest",5000);
		Emp emp1 = new Emp(10002,"Ford","Manager",2000);
		Emp emp2 = new Emp(10003,"Smith Bob","President",15000);
		//设置雇员与部门关系
		emp.setDept(dept);
		emp1.setDept(dept);
		emp2.setDept(dept);
		
		Emp[] emps = new Emp[]{emp,emp1,emp2};
		//设置部门与雇员信息，关键步骤：对象数组
		dept.setEmps(emps);//静态初始化
		
		//设置雇员之间领导关系
		emp.setMgr(emp1);
		emp1.setMgr(emp2);
		System.out.println("************DeptInfo***********");
		System.out.println(emp.getDept().getInfo());
		System.out.println(d.getInfo());
		System.out.println("************MrgInfo***********");
		System.out.println(emp.getMgr().getInfo());
		System.out.println("************AllEmpsInfo***********");
		
		for(int i = 0 ;i< emps.length;i++){
			System.out.println("\t|-"+(i+1)+emps[i].getInfo());
			//加判断是否为空
			//if(emps[i].getMgr()!=null)
			System.out.println("\t\t|-"+"Mrg:"+emps[i].getMgr().getInfo());
			}
	}
	public static void printCArray(Emp[] emps){
		for(int i = 0 ;i< emps.length;i++){
			System.out.println(i+"\t"+emps[i].getInfo());
		}
	}
}