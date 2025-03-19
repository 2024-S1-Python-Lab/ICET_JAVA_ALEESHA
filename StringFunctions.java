import java.util.Scanner;
public class StringFunctions
{
public static void main(String[] args)
{
System.out.println("Enter The String");
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
System.out.println("Length of String = "+str1.length());
System.out.println("Character at First position = "+str1.charAt(1));
System.out.println("String ends with e : "+str1.endsWith("e"));
System.out.println("LOWERCASE : "+str1.toLowerCase());
System.out.println("UPPERCASE : "+str1.toUpperCase());
System.out.println("Character at 2nd & 4th position is "+ str1.charAt(1) +
","+str1.charAt(3));
System.out.println("The sub string using start index only is "+ str1.substring(5));
System.out.println("The sub string using start index only is "+ str1.substring(0,4));
}
}
