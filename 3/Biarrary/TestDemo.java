public class TestDemo{
	public static void main (String args[]){
		//
		int[][] array = new int[2][2];
		
		int[][] arra =null;
		arra = new int[2][2];
		arra[0][0] = 1;
		arra[0][1] = 2;
		arra[1][0] = 3;
		arra[1][1] = 4;
		//
		int[][] barray ={{2,5},{5,6}};
		
		int[][] barra = new int[][]{
			{6,8},
			{9,10}
			};
			for(int i =0;i<barra.length;i++)
			{
				for(int j =0;j<barra[i].length;j++)
					System.out.print(barra[i][j]+"\t");
				System.out.println();
			}
			
	}
}