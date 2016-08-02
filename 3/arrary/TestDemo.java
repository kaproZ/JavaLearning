public class TestDemo{
	public static void main(String args[]){
		//动态初始化
		int[] array = new int[3];
		array[0] = 2;
		array[1] = 4;
		array[2] = 6;
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
		int[] b = null;
		b = new int[2];
		for(int i =0;i<b.length;i++){
			System.out.println(b[i]);
		}
		//静态初始化
		int[] c = {1,2,3};
		for(int i =0;i<c.length;i++){
			System.out.println(c[i]);
		}
		int[] d = new int[]{1,2};
		for(int i =0;i<d.length;i++){
			System.out.println(d[i]);
		}
	}
}