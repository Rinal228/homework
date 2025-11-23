abstract class GameCharacter{
	private String name;
	private int level;
	private double health;
	private double mana;
	private boolean isAlive;
	private static int totalCharacters = 0;
	private static final int MAX_LEVEL = 100;

	public GameCharacter(){
		this.name = "Rayan";
		this.level = 99;
		this.health = 99;
		this.mana = 1000;
		this.isAlive = true;
	}
	public GameCharacter(String name, int level, double health, double mana, boolean isAlive){
		this.name = name;
		this.level = level;
		this.health = health;
		this.mana = mana;
		this.isAlive = isAlive;
	}
	abstract void displayInfo();
	abstract void useSpecialAbility();
	public boolean attack() {
		System.out.println("Attack");
	}
	public void takeDamage(double damage) {
		this.health -= damage;
	}
	public void heal(double amount) {
		this.health += amount;
	}
	public String getName() {
		return this.name;
	}
}