public class GameParty {
	GameCharacter[] members = new GameCharacter[5];
	private static int index = 0;
	
	public void addCharacter(GameCharacter character){
		if(index < 4) {
			members[index] = character;
		} else {
			System.out.println("Team is full");
		}
	}
	public void removeCharacter(String name) {
		GameCharacter[] members1 = new GameCharacter[5];
		for(int i = 0; i < 5; i++) {

			if(members[i].super.getName().equals(name)) {

			} else {
				members1[i] = members[i];
			}
			
		}
	}
	public void displayPartyInfo(){
		for(int i = 0; i < 5; i++) {
			System.out.println(members[i].super.displayInfo());
		}
	}
	public void useAllSpecialAbilities(){
		for(int i = 0; i < 5; i++) {
			System.out.println(members[i].super.useSpecialAbility());
		}
	}
	public void findCharactersByClass(String className){
		for(int i = 0; i < 5; i++) {
			if(members[i].super.getClass().equals(className)) {
				System.out.println(members[i].super.getName());
			}
		}
	}
	public void calculatePartyPower(){
		int power = 0;
		for(int i = 0; i < 5; i++) {
			power += members[i].super.getStrength();
		}
		System.out.println(power);
	}

}