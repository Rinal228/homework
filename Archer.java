public class Archer extends GameCharacter {
	private double agility;
	private double accuracy;
	private String arrowType;

	@Override
	public void displayInfo(){
		System.out.println(super.name);
		System.out.println(this.agility);
		System.out.println(this.arrowType);
		System.out.println(this.accuracy);
	}
	@Override
	public void useSpecialAbility(){
		System.out.println("Using Прицельный выстрел");
	}
	public void attack(String target, double distance) {
		System.out.println("Aтака цели " + target + " на расстоянии " + distance);
	}
	public String getClass() {
		return "Archer";
	}
	public double getStrength() {
		return this.agility;
	}
}