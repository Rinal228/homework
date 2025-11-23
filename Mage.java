public class Mage extends GameCharacter{
	private double intelligence;
	private double spellPower;
	private String element;

	@Override
	public void displayInfo() {
		System.out.println(super.name);
		System.out.println(this.intelligence);
		System.out.println(this.spellPower);
		ystem.out.println(this.element);
	}
	@Override
	public void useSpecialAbility() {
		System.out.println("Using Magic shit");
	}
	public void castSpell(String spellName) {
		System.out.println(spellName);
	}
	public void meditate() {
		System.out.println("Mage is meditate");
	}
	public String getClass() {
		return "Mage";
	}
	public double getStrength() {
		return this.intelligence;
	}
}