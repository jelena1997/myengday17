package domain;

public class Dog extends Animal {
	private String specie;

	public Dog(String name, String specie) {
		super(name);
		this.specie = specie;
	}

	@Override
	public String toString() {
		return "Dog [specie=" + specie + "]";
	}

	@Override
	public void species() {
		System.out.println("I am dog");
	}
}
