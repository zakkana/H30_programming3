public class Example{
	public static void main (String args[]){
		int[] counts = {1,3,5,6,5,2};
		for(int point = 0; point < counts.length; point++){
			System.out.print(counts[point] + " : " );
			for(int number = 0; number != counts[point]; number++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}