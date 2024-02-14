/*Read a matrix from the console and check whether it is symmetric or not*/
import java.util.Scanner;
public class symmetric {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("JACOB K M\nROLLNO:32\n13-02-2024\n4.Read a matrix from the console and check whether it is symmetric or not");
System.out.println("Enter the Number of rows of the Matrix");
int row = sc.nextInt();
System.out.println("Enter the Number of Columns of the Matrix");
int col = sc.nextInt();
int matrix[][] = new int[row][col];
int i,j;
boolean state=true;
for(i=0;i<row;i++){
    for(j=0;j<col;j++){
        System.out.println("Enter the Element at M("+i+","+j+")");
       matrix[i][j] = sc.nextInt();
    }
}
for(i=0;i<row;i++){
    for(j=0;j<col;j++){
       if(matrix[i][j]!=matrix[j][i]){
           state=false;
           break;
       }
    }
}
if(state){
System.out.println("Matrix is Symmetric");
}
else{
System.out.println("Matrix is Antisymmetric");
}
}
}
