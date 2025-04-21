class MulTable extends Thread 
{
public void run()
{
for (int i = 1; i <= 10; i++)
{
System.out.println ("5 x " + i + " = " + (5 * i));
try
{
Thread.sleep(500); 
} catch (InterruptedException e)
{
System.out.println (e);
}
}
}
}
class OddNum extends Thread 
{
private int N;
public OddNum(int N) 
{
this.N = N;
}
public void run()
{
int count = 0, num = 1;
while (count < N)
{
System.out.print(num + " ");
num += 2; 
count++;
try
{
Thread.sleep(500);
} catch (InterruptedException e)
{ System.out.println(e); }
}
System.out.println();
}
}public class ThreadEx21 
{
public static void main(String[] args)
{ 
MulTable t1 = new MulTable();
OddNum t2 = new OddNum(10); 

t1.start();
t2.start();
}
}
