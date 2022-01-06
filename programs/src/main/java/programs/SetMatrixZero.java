package programs;

public class SetMatrixZero {
	
	public static void main(String args[]) {
		int matrix[][]= {{1,2,3,0},{2,3,4,1},{0,2,3,3},{1,2,1,1}};
		print(matrix);
		setZeroes(matrix);
		System.out.println();
		print(matrix);
		
	}
	public static void setZeroes(int [][] mat) {
		int col0=1,row=mat.length, col=mat[0].length;	
		for(int i=0;i<row;i++) {
			if(mat[i][0]==0)col0=0;
			for(int j=1;j<col;j++) {
				if(mat[i][j]==0)
					mat[i][0]=mat[0][j]=0;
			}
		}
		
		for(int i=row-1;i>=0;i--) {
			for(int j=col-1;j>=1;j--) {
				if(mat[i][0]==0||mat[0][j]==0)
					mat[i][j]=0;
			}
			if(col0==0)mat[i][0]=0;
		}
		
	}
	public static void print(int[][] mat) {
		int row=mat.length, col=mat[0].length;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
