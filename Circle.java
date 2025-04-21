package figures;
public class Circle
{
private double radius;
public Circle(double radius)
{
this.radius = radius;}
public double calcArea()
{
double ar= Math.PI * radius * radius;
return ar;
}
}
