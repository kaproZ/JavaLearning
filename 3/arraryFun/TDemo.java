public class TDemo{
	
	public static void main (String args[]){
		int[][] array = new int[][]{
			{1,2,8,5},
			{3,4,5,7}};
			//���ʼ��̬���ٿռ� [array[1].length][array.length];
		int temp[][] = new int[array[1].length][array.length];
			//Transf(array);
			printBi(array);
			Transfr(array,temp);
			printBi(temp);
			
	}
	
	
	
	
	
	
	
	
	
	//��ӡ��ά����
	public static void printBi(int[][] array){
		
			for(int i = 0;i<array.length;i++){
				for(int j = 0;j<array[i].length;j++){
					System.out.print(array[i][j]+"��");
				}
				System.out.println();
			}
			
	}
	//�ҵ�����ת�ã�ͬ��ͬ�У�
	public static void Transf(int[][] temp){
		int tmp;
		for(int i = 0;i<temp.length-1;i++){
			for(int j = temp.length-1;j>0;j--){
				tmp = temp[i][j];
				temp[i][j]=temp[j][i];
				temp[j][i]=tmp;
			}
		}
	}
	//��ͬ��ͬ��
	
	//��ʦ��ת���޸ĺ���ʦ��Ч�ʱ��ҵĸ�
	public static void Trans(int[][] temp){
		int tmp;
		// x<temp.length/2ʱ��������2��ż��ά���������һ��ת��
		for( int x = 0;x<temp.length/2+1;x++){
			
			for(int y = x ;y<temp[x].length;y++){
				if(x!=y){
					tmp=temp[x][y];
					temp[x][y] = temp[y][x];
					temp[y][x] = tmp;
				}
			}
		}
	}
	//��չ��ͬ��������ת��
	public static void Transfr(int[][] array,int[][] temp){
		for(int i =0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				temp[j][i]=array[i][j];
			}
		}
	}
	
	//�����������System.arraycopy(Դ����Դ��ʼ��Ŀ������Ŀ����ʼ������)
	public static void copy(int[][] origin,2,int[][])
}
