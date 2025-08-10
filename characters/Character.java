

public abstract class Character {
	//Attributes all characters have 
	public String name;
	public int maxHp, hp;
	
	
	public Character(String name, int maxHp) {
		
		this.name = name;
		this.maxHp = maxHp;
		this.hp=maxHp;
	}
	
	//method every character has
	public abstract void updateHP(int damage);
	
	
}
