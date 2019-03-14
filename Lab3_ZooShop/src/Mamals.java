package ua.lviv.iot.zoo.shop;

public class Mamals extends AnimalShop {

	private AnimalWoolType wool;
	
	public Mamals(String name, int price, Enum<kindOfAnimal> CASUAL, String colour, int age, int weight, Enum<Sex> MALE, String Food){
		
		super(name,price,kindOfAnimal.PREDATORS, colour, age, weight, Sex.MALE, Food  );
	} 

	public Mamals(AnimalWoolType wool) {
		super();
		this.wool = wool;
	}

	public AnimalWoolType getWool() {
		return wool;
	}

	public void setWool(AnimalWoolType wool) {
		this.wool = wool;
	}
	
	
}
