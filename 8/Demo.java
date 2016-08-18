class Dept{
	private int deptno;//*
	private String dname;//*
	private String loc;
	private Emp[] emps;//对象数组
	
	public Dept(int deptno,String dname){
		this.deptno = deptno;
		this.dname = dname;
	}
	public void setEmps(Emp[] emps){
		this.emps = emps;
	}
	public Emp[] getEmps(){
		return this.emps;
	}
	public String getInfo(){
		if(this.loc==null){
			return "Dept_NO："+this.deptno+
		", Dept_NAME："+this.dname;
		}
		else
			return "Dept_NO："+this.deptno+
		", Dept_NAME："+this.dname+
		", Dept_LOC: "+this.loc;
		
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
	public void setMgr(Emp mgr){
		this.mgr = mgr;
	}
	public Emp getMgr(){
		return this.mgr;
	}
	public String getInfo(){
		if(this.dept==null){
			return "Emp_NO: "+this.empno+
		", Emp_NAME:　"+this.ename+
		", Emp_Job: "+this.job+
		", Emp_Sal: "+this.sal;
		}
		else{
			if(this.mgr==null){
				return "Emp_NO: "+this.empno+
		", Emp_NAME:　"+this.ename+
		", Emp_Job: "+this.job+
		", Emp_Sal: "+this.sal+"\n"+"\t"+"|-"+
		", Emp_Dept: "+this.dept.getInfo();
			}
			else{
				return "Emp_NO: "+this.empno+
		", Emp_NAME:　"+this.ename+
		", Emp_Job: "+this.job+
		", Emp_Sal: "+this.sal+"\n"+"\t"+"|-"+
		", Emp_Dept: "+this.dept.getInfo()+"\n"+this.mgr.getInfo();
			}
		}
	}
}

public class Demo{
	public static void  main(String[] args){
		//初始化独立的数据
		Dept dept = new Dept(1,"QA");
		Emp emp = new Emp(10001,"Joh","AutoTest",5000);
		Emp emp1 = new Emp(10002,"Ford","Manager",2000);
		Emp emp2 = new Emp(10003,"Smith Bob","President",15000);
		//设置雇员与部门关系
		emp.setDept(dept);
		emp1.setDept(dept);
		emp2.setDept(dept);
		
		//关键步骤：对象数组
		dept.setEmps(new Emp[]{emp,emp1,emp2});
		
		//设置雇员之间领导关系
		emp.setMgr(emp1);
		emp1.setMgr(emp2);
		// System.out.println("************DeptInfo***********");
		// System.out.println(dept.getInfo());
		System.out.println("************empInfo***********");
		System.out.println(emp.getInfo());
		System.out.println("************MrgInfo***********");
		
	}
}