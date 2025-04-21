package figures;
public class Triangle
{
private double base;
private double height;
public Triangle(double base, double height)
{
this.base = base;
this.height = height;
}
public double calcArea()
{
double ar=0.5 * base * height;
return ar;
}
}
