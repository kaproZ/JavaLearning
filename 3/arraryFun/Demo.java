public class Demo{
	public static void main(String args[]){
		int array[] =new int[]{1,5,9,6,8,7,2};
		Bub(array);
		for(int i = 0;i<array.length;i++)
		System.out.print(array[i]+"¡¢");
	}
	//Ã°ÅÝÅÅÐò
	public static void Bub(int temp[]){
		int tmp;
		for(int i =0;i<temp.length;i++){
			for(int j=0;j<temp.length-1;j++){
				if(temp[j]>temp[j+1]){
					tmp = temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=tmp;
				}
			}
		}
	}
	//Ã°ÅÝÅÅÐòÓÅ»¯
	public static void Bubble(int temp[]){
		int tmp;
		for(int i= temp.length-1;i>0;i--){
			for(int j=0;j<i;j++)
			{
				if(temp[j]>temp[j+1]){
					tmp = temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=tmp;
				}
			}
		}
	}
}