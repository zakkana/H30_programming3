public class ReturnExample{
	public static boolean isPositiveNumber ( int num) {
		// if ( num > 0){
			// return true;
		// }
		// else {
			// return false;	
		// }
		return num > 0;
	}

	public static void main (String[] args){
		int i = -10;
		if (isPositiveNumber(i)) {
			System.out.println("positive");
		}
		else {
			System.out.println("unpositive");
		}
	}
}