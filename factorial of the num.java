	class java 
       {
       
	public static void main (String[] args)
        { 
        int i,a;
	double sum = 1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value here...");
	a = s.nextInt();
	for (i = 1; i <= a; i++)
	{
	sum = sum*i;
	}
	System.out.println("Factorial of the num is :"  +sum);
        }
}