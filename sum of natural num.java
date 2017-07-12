class java
{
public static void main(String[] agrs)
{
int a,x = 1;
int sum = 0;
System.out.println("Enter the natural num ...");
Scanner s = new Scanner(System.in);
a = s.nextInt();
while (x <= a)
{
sum = sum + x;
x++;
}
System.out.println("sum of the ntural num is.." +sum);
}
}