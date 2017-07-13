	class java 
       {
       
	public static void main (String[] args)
        { 
        int x,y;
	int sum = 1;
	Scanner s = new Scanner(System.in);
	System.out.println("multiplication table upto 20... Enter table num :");
	x = s.nextInt();
	for ( y = 1; y <= 20; y++)
	{
	sum = x*y;
	System.out.println( x+ "*" +y+ "=" +sum);
        }
       }
}