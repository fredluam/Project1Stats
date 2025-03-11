package ClassGame;

public class Pokemons {

	private int attackPower;
	private int health;
	private String name;
	
	public Pokemons(String name, int attackPower, int health) {
		super();
		this.attackPower = attackPower;
		this.name = name;
		this.health = health;
		
	}
	
	public int attack(Pokemons attacker, Pokemons defender) {
		health = attacker.getAttackPower() - defender.getHealth();
		return  health;
		
	}
	
	public int getHealth() {
		return health;
	}
	 
	public String getPokemon() {
	return name;
	}
	public int getAttackPower() {
		
		return attackPower;
	}
	public String getName() {
		return name;
	}
}
