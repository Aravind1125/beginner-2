	class java 
       {
       
	public static void main (String[] args)
        { 
        int i,x;
	int sum ;
	Scanner s = new Scanner(System.in);
	x = s.nextInt();
	System.out.println("Odd number between 1 and " +x);
	for ( i = 1; i <= (x/2); i++ )
	{
        sum = (2*i)-1;
        System.out.println(sum);
        }
      }
}