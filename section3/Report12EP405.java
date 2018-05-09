// 2EP4  池田輝行
public class Report12EP405 {
	public static void main( String[] args ){
		int[] value = new int[args.length];
		
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec",};
		
		for ( int number = 0; number < value.length; number++ ){
			value[number] = Integer.parseInt(args[number]);
		}

		for ( int number = 0; number < value.length; number++ ){
			int rms = value[number] - 1 ;
			System.out.printf( "%2s:%4s%n", args[number] , months[rms] );
		}
			
	}
}