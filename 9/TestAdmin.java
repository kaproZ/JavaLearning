//管理员
class Admin{
	private String aid;
	private String psd;
	private Role role;
	public Admin(String aid,String psd){
		this.aid = aid;
		this.psd = pds;
	}
	public void setRole(Role role){
		this.role = role;
	}
	public Role getRole(){
		return this.role;
	}
	public String getInfo(){
		return "Admin ID:"+this.aid+
		"\tpassword:"+this.psd;
	}
}
//角色
class  Role{
	private int rid;
	private String name;
	private Admin[] admins;
	private AGroup[] agroups;
	public Role(int rid,String name){
		this.rid = rid;
		this.name = name;
	}
	public void setAdmins(Admin[] admins){
		this.admins = admins;
	}
	public Admin[] getAdmins(){
		return this.admins;
	}
	public void setAGroups(AGroup[] agroups){
		this.agroups = agroups;
	}
	public AGroup[] getAGroups(){
		return this.agroups;
	}
	public String getInfo(){
		return"Role ID:"+this.id+
		"\tname:"+this.name;
	}
}
//权限组
class AGroup{
	private int gid;
	private String name;
	private Role[] roles;
	private Action[] actions;
	public AGroup(int gid,String name){
		this.gid =gid;
		this.name =name;
	}
	public void setRoles(Role[] roles){
		this.roles = roles;
	}
	public Role[] getRoles(){
		return this.roles;
	}
	public void setActions(Action[] actions){
		this.actions = actions;
	}
	public Action[] getAction(){
		return this.actions;
	}
	public String getInfo(){
		return"AGroup ID:"+this.gid+
		"\tname:"+this.name;
	}
}
//权限
class Action{
	private int aid;
	private String name;
	private String url;
	private AGroup agroup;
	public Action(int aid,String name,String url){
		this.aid = aid;
		this.name = name;
		this.url = url;
	}
	public void setAGroup(AGroup agroup){
		this.agroup =agroup;
	}
	public AGroup getAGroup(){
		return this.agroup;
	}
	public String getInfo(){
		return"Action ID:"+this,aid+
		"\tname"+this.name+
		"\turl :"+this.url;
	}
}
public class TestAdmin{
	public static void main (String[] args){
		Admin admin1 = new Admin("老板","123456");
		Admin admin2 = new Admin("员工","123456");

		Role role1 = new Role(1,"系统管理员角色");
		Role role1 = new Role(2,"访客角色");
		
		Group group1 = new Group(10,"InfoManage");
		Group group2 = new Group(11,"UserManage");
		
	}
}