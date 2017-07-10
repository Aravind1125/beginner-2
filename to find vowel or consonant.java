public class odd or even
{
public static void main(String[] agrs);
{
	char a;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Character..");
a = s.next().charAt(0);
if ( a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' )
{
System.out.println("It is vowel");
}
else
{
System.out.println("It is consonant");
}
}
}