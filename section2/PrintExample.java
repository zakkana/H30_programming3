public class PrintExample {
	public static void main( String[] args) {
		System.out.print( "Good Night." );
		System.out.print( "It's fine weather today,isn't it?\n");
		int i = 5;
		double d = 9.9;
		char c = 'A';
		byte b =81;
		boolean bool = true;
		int tmp = 8494501;
		tmp %= 10;
		
		System.out.println(i);
		System.out.println("The value of bool is " + bool);
		System.out.println("The value of c is " + c);
		System.out.println("The value of b is " + b);
		System.out.println("The value of d is " + d);
		System.out.println("******Substitute (doble->int)d for i******");
		i =(int)d;
		System.out.println("The value of i is " + i);
		System.out.println("******Substitute i for d******");
		d = i;
		System.out.println("The value of d is " + d);
		d += 0.9;
		System.out.println(i + d);
		i = 5;
		b = 2;
		d = i / b;
		System.out.println(d);
		d = (double)i / (double)b;
		System.out.println(d);
		String message = "Good evening";
		System.out.println(message);
	}
}