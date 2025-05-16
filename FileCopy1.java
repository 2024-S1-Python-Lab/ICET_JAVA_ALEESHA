import java.io.*; import java.util.Scanner;
public class FileCopy1
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in); System.out.print("Enter source file name: "); String sourceFile = scanner.nextLine(); System.out.print("Enter destination file name: "); String destinationFile = scanner.nextLine(); FileInputStream fr = null;
FileOutputStream fc = null;
try
{
fr = new FileInputStream(sourceFile);
fc = new FileOutputStream(destinationFile);
int c;
while ((c = fr.read()) != -1) 
{
fc.write(c);
System.out.print((char) c); // Print characters while copying
}
System.out.println("\nFile copied successfully!");
}
catch (FileNotFoundException e)
{
System.out.println("File not found\nException: " + e);
}
catch (IOException e)
{
System.out.println("An error occurred while copying\nException: " + e);
}
finally 
{
try 
{
if (fr != null)  fr.close(); if (fc != null)  fc.close();
}
catch (IOException e)
{
System.out.println("Error closing streams\nException: " + e);
}
scanner.close();
}
}
}