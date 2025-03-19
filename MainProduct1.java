class Product
{
int pcode;
String pname;
int pprice;
Product(int code, String name, int price)
{
pcode = code;
pname = name;
pprice = price;
}
void display()
{
System.out.println("Product Code : "+pcode);
System.out.println("Product Name : "+pname);
System.out.println("Product Price : "+pprice);
}
}
class MainProduct1
{
public static void main(String args[])
{
Product ob1=new Product(123,"Pen",10);
Product ob2=new Product(423,"Pencil",5);
Product ob3=new Product(233,"Book",30);
System.out.println("\n Product with lowest price");
if (ob1.pprice < ob2.pprice)
if (ob1.pprice < ob3.pprice)
ob1.display();
else
ob3.display();
else if (ob3.pprice < ob2.pprice)
ob3.display();
else
ob2.display();
}
}
