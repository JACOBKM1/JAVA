/*2. Read 2 matrices from the console and perform matrix addition*/
import java.util.Scanner; 
public class addmatrix {
	public static void main(String args[])
	{
	int row, col,i,j;
	Scanner in = new Scanner(System.in);
	System.out.println("JACOB K M \n ROLLNO:32\nDATE:13-02-2024\nQ2.Read 2 matrices from the console and perform matrix addition.");
	System.out.println("\nEnter the number of rows");
	row = in.nextInt();
	System.out.println("Enter the number columns");
	col = in.nextInt();
	int mat1[][] = new int[row][col];
	int mat2[][] = new int[row][col];
	int res[][] = new int[row][col]; 
	System.out.println("Enter the elements of matrix 1");
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	mat1[i][j] = in.nextInt();
	System.out.println();
	}
	System.out.println("Enter the elements of matrix 2");
	for ( i= 0 ; i < row ; i++ )
	{
	for ( j= 0 ; j < col ;j++ )
	mat2[i][j] = in.nextInt();
	System.out.println();
	}
	for ( i= 0 ; i < row ; i++ )
	for ( j= 0 ; j < col ;j++ )
	res[i][j] = mat1[i][j] + mat2[i][j] ; 
	System.out.println("Sum of matrices:-");
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(res[i][j]+"\t");
	System.out.println();
	}
	}
}