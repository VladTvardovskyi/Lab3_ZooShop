package ua.lviv.iot.zoo.shop;

public class Fish<Food> extends AnimalShop {

	private String AquariumFish;
	private FishFormType typeOfBird;
	private String AquariumEnviroment;
	
	public Fish (String name, int price, Enum<kindOfAnimal> String, String colour, int age, int weight, Enum<Sex> male, String Food, Enum<FishFormType> normal){
	
		super(name,price,kindOfAnimal.CASUAL, colour, age, weight, Sex.MALE, Food  );
		
	}
	
	public Fish(String aquariumFish, FishFormType typeOfBird, String aquariumEnviroment) {
		super();
		AquariumFish = aquariumFish;
		this.typeOfBird = typeOfBird;
		AquariumEnviroment = aquariumEnviroment;
	}
	public String getAquariumFish() {
		return AquariumFish;
	}
	public void setAquariumFish(String aquariumFish) {
		AquariumFish = aquariumFish;
	}
	public FishFormType getTypeOfBird() {
		return typeOfBird;
	}
	public void setTypeOfBird(FishFormType typeOfBird) {
		this.typeOfBird = typeOfBird;
	}
	public String getAquariumEnviroment() {
		return AquariumEnviroment;
	}
	public void setAquariumEnviroment(String aquariumEnviroment) {
		AquariumEnviroment = aquariumEnviroment;
	}
	
	
}
