public class TestDemo{
	public static void main(String args[]){
		int[] array = new int[]{1,5,6,7};
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println();
		change(array);//int temp[] =array;
		
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}
	public static void change(int temp[]){
			for(int i =0;i<temp.length;i++){
				temp[i]*=2;
			}
		} 
}