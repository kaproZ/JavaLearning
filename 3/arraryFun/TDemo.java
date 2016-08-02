public class TDemo{
	
	public static void main (String args[]){
		int[][] array = new int[][]{
			{1,2,8,5},
			{3,4,5,7}};
			//随初始动态开辟空间 [array[1].length][array.length];
		int temp[][] = new int[array[1].length][array.length];
			//Transf(array);
			printBi(array);
			Transfr(array,temp);
			printBi(temp);
			
	}
	
	
	
	
	
	
	
	
	
	//打印二维数组
	public static void printBi(int[][] array){
		
			for(int i = 0;i<array.length;i++){
				for(int j = 0;j<array[i].length;j++){
					System.out.print(array[i][j]+"、");
				}
				System.out.println();
			}
			
	}
	//我的数组转置（同列同行）
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
	//不同列同行
	
	//老师的转置修改后；老师的效率比我的高
	public static void Trans(int[][] temp){
		int tmp;
		// x<temp.length/2时，当大于2的偶数维数组出现少一次转置
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
	//拓展不同行列数组转置
	public static void Transfr(int[][] array,int[][] temp){
		for(int i =0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				temp[j][i]=array[i][j];
			}
		}
	}
	
	//数组操作方法System.arraycopy(源名，源起始，目标名，目标起始，长度)
	public static void copy(int[][] origin,2,int[][])
}
