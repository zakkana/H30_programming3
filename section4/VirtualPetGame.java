class VirtualDog{
	String name;
	int maxHP;
	int HP;
}
public class VirtualPetGame {
	public static void main (String[] args){
		VirtualDog taro = new VirtualDog();
		taro.name = "taro";
		taro.maxHP = 10;
		taro.HP = taro.maxHP;
		System.out.println("-------start--------");
		while (taro.HP > 0){
			int pHit = (int)(Math.random() * 2);
			int Hit = (int)(Math.random()*10) + 1;
			System.out.println("taro's HP : " + taro.HP);	
			System.out.println("attack point :" + Hit );
			if ( pHit == 1 && (taro.HP - Hit) >= 0 ){
				taro.HP -= Hit;
				System.out.println("hit");
				System.out.println("taro's HP : " + taro.HP);
				System.out.println("-----------------");
			}
			else if( pHit == 0 ){
				System.out.println("miss");
				System.out.println("-----------------");
			} 
			else if ( (taro.HP - Hit )  < 0){
				taro.HP = 0;
				System.out.println("hit!!");
				System.out.println("taro's HP : " + taro.HP);	
				System.out.println("-------gameover--------");
			}
		}
	}
}