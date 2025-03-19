import java.util.Scanner;
class Complex
{
int real, imaginary;
Complex (int real, int imaginary) 
{
this.real = real;
this.imaginary = imaginary;
}
Complex addComplex (Complex ip1, Complex ip2)

{
Complex temp = new Complex (0, 0);

temp.real = ip1.real + ip2.real;
temp.imaginary = ip1.imaginary + ip2.imaginary;
return temp;
}
}
public class Complex3
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println ("Enter real & imaginary part of the 1st complex number:");
int real1 = sc.nextInt();
int imaginary1 = sc.nextInt();
Complex ip1 = new Complex (real1, imaginary1);
System.out.println ("1st complex number: " + ip1.real + "+i" + ip1.imaginary);
System.out.println ("Enter real & imaginary part of the 2nd complex number:");
int real2 = sc.nextInt( );
int imaginary2 = sc.nextInt( );
Complex ip2 = new Complex (real2, imaginary2);
System.out.println ("2nd complex number: " + ip2.real + "+i" + ip2.imaginary);

Complex result = new Complex (0, 0);
result = result.addComplex (ip1, ip2);
System.out.println ("Sum: " + result.real + "+i" + result.imaginary);
}
}
