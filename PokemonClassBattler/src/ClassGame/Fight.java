package ClassGame;

public class Fight {

	public Fight(){
		
		
	}
	public boolean fight(Pokemons attacker, Pokemons defender) {
		boolean bool = true;
		
		while(bool) {
			attacker.attack(attacker, defender);
			if(defender.getHealth() <= 0) {
				bool = false;
				System.out.println(attacker.getName() + " Has won!");
			}else {
				defender = attacker;
				bool = true;
			}
		}
		return bool;
		
	}
}
