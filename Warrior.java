public class Warrior extends GameCharacter {
	private double strength;
	private double armor;
	private String weaponType;

	@Override
	public void displayInfo() {
		System.out.println(super.name);
		System.out.println(this.strength);
		System.out.println(this.weaponType);
	}
	@Override
	public void useSpecialAbility(){
		System.out.println("Берсерк");
	}
	public void attack(String weapon){
		System.out.println("Attack with " + weapon);
	}
	public String getClass() {
		return "Warrior";
	}
	public double getStrength() {
		return this.strength;
	}


}