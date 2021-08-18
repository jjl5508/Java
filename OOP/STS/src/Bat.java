
public class Bat {
	protected String name;
	protected int energy;
	
	public Bat(String name, int energy) {
		super();
		this.name = name;
		this.energy = energy;
	}
	
	public void fly() {
		energy -= 50;
		System.out.println("Pew, Pew." +" " + "Energy:" + energy);
	}
	
	public void eatHumans() {
		energy +=25;
		System.out.println("Energy:" + energy);
	}

	public void attackTown() {
		energy -= 100;
		System.out.println("Burn Baby, Burn!" + " " + "Energy:" + energy);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
}
