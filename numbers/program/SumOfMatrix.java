package numbers.program;

public class SumOfMatrix {

	public static void main(String[] args) {
		//Declare a variables
		int row,cols,sumRow,sumCol;
		//declare a two dimentional array
		int a[][]= {
				    {1,2,1},
				    {2,1,5},
				    {1,2,3}
				    };
		
		//size if rows and cols
		row=a.length;
		cols=a[0].length;
		
		//sum of rows
		for (int i = 0; i <row; i++) {
			sumRow=0;
			for (int j = 0; j < cols; j++) {
				sumRow=sumRow+a[i][j];
			}
			System.out.println("sum of rows "+(i+1)+" row is :"+sumRow);
		}
		
		//sum of cols
		for (int i = 0; i < cols; i++) {
			sumCol=0;
			for (int j = 0; j < row; j++) {
				sumCol=sumCol+a[j][i];
			}
		System.out.println("sum of "+(i+1)+" col is :"+sumCol);	
		}
	}

}
