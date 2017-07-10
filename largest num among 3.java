public class java
{
public static void main(String[] agrs);
{
	int x,y,z,large;
Scanner s = new Scanner(System.in);
System.out.println("Enter the num 1..");
x = s.nextInt();
System.out.println("Enter the num 2..");
y = s.nextInt();
System.out.println("Enter the num 3..");
z = s.nextInt();

if ( x > y && x > z)
{
large = x;
}
else if ( y > x && y > z )
{
large = y;
}
else
{
large = z;
}
System.out.println("the largest num is..." +large);
	}
}