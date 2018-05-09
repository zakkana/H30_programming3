public class Example2 {
	public static void countdown(int start , int end ){
		System.out.println("Do countdown");
		for (int i = start; i>= end; i--){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		countdown(7,3);
	}
}