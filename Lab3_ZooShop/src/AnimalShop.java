package ua.lviv.iot.zoo.shop;

public class AnimalShop {

	private String name;
	private int price;
	private kindOfAnimal type;
	private String colour;
	private int age;
	private int weight;
	private Sex sex;
	private String Food;
	
	public AnimalShop() {
	}

	public AnimalShop(String name, int price, kindOfAnimal type, String colour, int age, int weight, Sex sex,
			String Food) {
		
		this.name = name;
		this.price = price;
		this.type = type;
		this.colour = colour;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.Food = Food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public kindOfAnimal getType() {
		return type;
	}

	public void setType(kindOfAnimal type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getFood() {
		return Food;
	}

	public void setFood(String food) {
		this.Food = food;
	}

	@Override
	public String toString() {
		return "AnimalShop [name=" + name + ", price=" + price + ", colour=" + colour + ", age=" + age + "]";
	}
	
	
}

