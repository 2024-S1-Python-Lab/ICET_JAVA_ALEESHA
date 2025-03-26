interface BillCalc
{
double calculate(double quantity, double unitPrice);
}
class Bill implements BillCalc
{
private int orderNo;
private String date;
private String[][] items;
Bill(int orderNo, String date, String[][] items)
{
this.orderNo = orderNo;
this.date = date;
this.items = items;
}
@Override
public double calculate(double quantity, double unitPrice)
{
return quantity * unitPrice;
}
public void generateBill()
{
System.out.println("Order No.: " + orderNo);
System.out.println("Date: " + date);
System.out.println("Product Id\tName\tQuantity\tUnit Price\tTotal");
double netAmount = 0.0;
for (String[] item : items)
{
int productId = Integer.parseInt(item[0]);
String name = item[1];
double quantity = Double.parseDouble(item[2]);
double unitPrice = Double.parseDouble(item[3]);
double total = calculate(quantity, unitPrice);
netAmount += total;
System.out.println(productId+"\t" + name + "\t" + quantity + "\t" + unitPrice +
"\t" + total);
}
System.out.println("\t\t\t\t\tNet. Amount\t" + netAmount);}
}
public class CO3Bill
{
public static void main(String[] args)
{
int orderNo = 123;
String date = "2024-03-20";
String[][] items = {{"101", "A", "2", "25"},{"102", "B", "1", "100"}};
Bill bill = new Bill (orderNo, date, items);
bill. generateBill ();
}
}
