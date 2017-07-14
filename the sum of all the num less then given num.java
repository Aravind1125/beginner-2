class java
{
public static void main (String[] args) 
{
int a,i;
int sum = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the num....");
a = s.nextInt();
for (i = 0;i <= a; i++)
{
sum = sum + i;
}
System.out.println("The sum of all the num less then " +a+ "\n" +sum);
}
}