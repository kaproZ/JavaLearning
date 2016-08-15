public class StringDemo{
	public static void main(String[] agrs){
		String str1 = "hello word";
		String str2 = "***//fHello word";
		String str3 = "hello"+"word";
		String str4 = "hello";
		String str5 = str4.concat("word");
		System.out.print(str1==str3);
		System.out.println(str4==str5);

		Byte[] bt1 = {97,98,99};
		Byte[] bt2 = {65,98,99};
		System.out.println(str2.toLowerCase());
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equals(str2));
		
		
		System.out.println(bt1.equals(bt2));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		
		System.out.println(str2.contains(str3));
		System.out.println(str2.substring(5));
		System.out.println(str2.concat(str3));
		
		System.out.println(str2.indexOf(str3));
		System.out.println(str2.lastIndexOf(str3));
		System.out.println(str2.startsWith("e"));
	}
}