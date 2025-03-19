import java.util.Scanner;
class Matrix
{
private int rows;
private int columns;
private int mat [ ][ ];
public Matrix (int rows, int columns)
{
this.rows = rows;this.columns = columns;
this.mat = new int [rows][columns];
}
public void read (Scanner sc)
{
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < columns; j++)
mat[i][j] = sc.nextInt();
}
}
public void printMatrix()
{
System.out.println("Matrix:");
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < columns; j++)
System.out.print(mat[i][j] + " ");
System.out.println();
}
}
public boolean isSymmetric()
{
if (rows != columns)
return false;
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < i; j++)
if (mat[i][j] != mat[j][i])
return false;

}
return true;
}
public Matrix transpose()
{
Matrix transMatrix = new Matrix(columns, rows);
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < columns; j++)
transMatrix.mat[j][i] = mat[i][j];
}
return transMatrix;
}
}public class Symmetric
{
public static void main(String[] args)
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number of rows in the matrix:");
int rows = sc.nextInt();
System.out.println("Enter the number of columns in the matrix:");
int columns = sc.nextInt();
Matrix mat = new Matrix (rows, columns);
mat.read(sc); 
mat.printMatrix ();
Matrix transMatrix = mat.transpose();
transMatrix.printMatrix();
if (mat.isSymmetric())
System.out.println("The matrix is symmetric.");
else
System.out.println("The matrix is not symmetric.");
}
}
