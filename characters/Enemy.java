

import java.util.*;

public class Enemy extends Character implements AttackStrategy{


	public Enemy(String name, int maxHp) {
		super(name, maxHp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		System.out.println(name + " performed an attack");
		Random r = new Random();
		int damage = r.nextInt(21) + 10;
		return damage;
	}

	@Override
	public void updateHP(int damage) {
		// TODO Auto-generated method stub
		this.hp -= damage;
		if (this.hp < 0) {
	        this.hp = 0;
	    }
	}
	
}
