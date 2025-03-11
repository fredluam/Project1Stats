package ClassGame;

public class Arena {

	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu("Pikachu", 55, 35);
		Charizard charizard = new Charizard("Charizard", 84, 78);
		
		Fight f = new Fight();
		
		f.fight(pikachu, charizard);
		
		
	}
	
	

}
