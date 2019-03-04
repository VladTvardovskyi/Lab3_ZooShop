package ua.lviv.iot.zoo.shop.manager;

import java.util.ArrayList;

import java.util.List;


import ua.lviv.iot.zoo.shop.*;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZooManager manager1 = new ZooManager();
		
		 Birds Parrot1 = new Birds ("Kesha", 700, kindOfAnimal.CASUAL, "rainbow", 3, 400, Sex.MALE, "Birdskorm", BirdsSoundsType.VOICE);
		 Birds Parrot2 = new Birds ("kondogba", 950, kindOfAnimal.CASUAL, "Orange", 5, 550, Sex.FEMALE, "Birdskorm", BirdsSoundsType.SOUNDS);
		 Mamals Rabbit = new Mamals ("Machine", 3000, kindOfAnimal.CASUAL, "Black", 9, 1200, Sex.MALE, "ProteinMixedFeed");
		 Mamals Chihuahua = new Mamals ("Krasava", 1500, kindOfAnimal.CASUAL, "Grey", 7, 2000, Sex.MALE, "SpecialGrain");
		 Mamals Hamster = new Mamals ("Sanya", 400, kindOfAnimal.CASUAL, "Orange", 4, 350, Sex.FEMALE, "SpecialGrain");
		 Fish Piranha = new Fish ("Little Killer", 5000, kindOfAnimal.PREDATORS, "Dark Green", 2, 200, Sex.MALE, "ProteinMixedFeed", FishFormType.NORMAL);
		 Fish Scalary = new Fish ("No name", 250, kindOfAnimal.CASUAL, "Blue", 1, 150, Sex.MALE, "FishingChips", FishFormType.THIN);
		 Fish GoldFish = new Fish ("Lazy", 300, kindOfAnimal.CASUAL, "Gold", 6, 250, Sex.FEMALE, "FishingChips", FishFormType.FAT);
		 
	
	
	List <AnimalShop> newAnimalShopList = new ArrayList<>();
	
	newAnimalShopList.add(Parrot1);
	newAnimalShopList.add(Parrot2);
	newAnimalShopList.add(Rabbit);
	newAnimalShopList.add(Chihuahua);
	newAnimalShopList.add(Hamster);
	newAnimalShopList.add(Piranha);
	newAnimalShopList.add(Scalary);
	newAnimalShopList.add(Parrot1);
	
	 System.out.println(manager1.findBySex(newAnimalShopList, Sex.MALE).toString());
     System.out.println(manager1.findBySex(newAnimalShopList, Sex.FEMALE).toString());
     System.out.println();

     System.out.println(manager1.sortByFood(newAnimalShopList).toString());
     System.out.println();
     
     System.out.println(manager1.sortByPriceIncrease(newAnimalShopList ).toString());
     System.out.println(manager1.sortByPriceDecrease(newAnimalShopList).toString());
     System.out.println();

     System.out.println(manager1.sortByWeightIncrease(newAnimalShopList).toString());
     System.out.println(manager1.sortByWeightDecrease(newAnimalShopList).toString());
     System.out.println();

 }


}
