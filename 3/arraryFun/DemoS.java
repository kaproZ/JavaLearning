public class DemoS{
	public static void main(String args[]){
		//int[] array = new int[]{1,2,3,4,5,6};
		int[] target = new int[]{1,2,8,8,8,6};
		// aset(array);
		// print(array);
		//copy(array,2,target,2,3);
		//System.arraycopy(array,2,target,2,3);
		java.util.Arrays.sort(target);
		print(target);
	
	}
	//首位交换数组
	public static void aset(int[] temp){
		int tmp = 0;
		int l=temp.length;
		for(int i=0;i<l/2;i++)
		{
			tmp = temp[i];
			temp[i] = temp[l-1-i];
			temp[l-1-i] = tmp;
		}
	}
	
	//打印数组
	public static void print(int[] array){
		for(int i = 0;i<array.length;i++)
			System.out.print(array[i]+"、");
	}
		//仿写数组操作方法System.arraycopy(源名，源起始，目标名，目标起始，长度)
	public static void copy(int[] origin,int n,int[] target,int m,int len){
		
		for(int i=0;i<len;i++){
			target[m+i] = origin[n+i];
		}
		
	}
}