public class Demo{
	public static void main(String[] args){
		String str = "abc";
		String str1 = "adfdf1";
		String str2 = "12345678";
		String str3 = "123abd";
		System.out.print(TrasSub(str));
	
		System.out.println(isNum(str1));
		System.out.println(isNum(str2));
		System.out.println(isNum(str3));
	}
	//2.判断是否都是数字
	public static String isNum(String temp){
		//字符串变成数组
		char[] c= temp.toCharArray();
		for(int i= 0;i<c.length;i++){
			if(c[i]<'0'||c[i]>'9')
				return "字符串由非数字组成";
		}
		return "字符串由数字组成";
	}
	
	//1.字符串转大写字母,返回修改后的字符串
	public static String TrasSub(String temp){
		char[] c= temp.toCharArray();
		for(int i=0;i<c.length;i++){
			c[i]-=32;
		}
		return new String(c);
	}
}