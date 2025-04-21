package figures;
public class Rectangle
{
private double length;
private double breadth;
public Rectangle(double length, double breadth)
{
this.length = length;
this.breadth = breadth;
}
public double calcArea()
{double ar=length * breadth;
return ar;
}
}
