package ua.lviv.iot.zoo.shop;

public class Birds extends AnimalShop {

	private BirdsSoundsType BirdsVoice;
	private String BirdColour;
	
	
	public Birds(){
		
	}
	
	



	public Birds(BirdsSoundsType birdsVoice, String birdColour) {
		super();
		BirdsVoice = birdsVoice;
		BirdColour = birdColour;
	}

	public Birds(String name, int price, Enum<kindOfAnimal> casual, String colour, int age, int weight, Enum<Sex> female, String Food,
			BirdsSoundsType sounds) {
	super(name, price, kindOfAnimal.CASUAL, colour, age, weight, Food );
	}





	public BirdsSoundsType getBirdsVoice() {
		return BirdsVoice;
	}

	public void setBirdsVoice(BirdsSoundsType birdsVoice) {
		BirdsVoice = birdsVoice;
	}

	public String getBirdColour() {
		return BirdColour;
	}

	public void setBirdColour(String birdColour) {
		BirdColour = birdColour;
	}
	
	
	
}
