package ua.lviv.iot.zoo.shop.manager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

import ua.lviv.iot.zoo.shop.*;


public class ZooManager {

	private List<AnimalShop> zooShop = new ArrayList<>();
	
	
	public ZooManager(){
		
	}


	public ZooManager(List<AnimalShop> zooShop) {
		super();
		this.zooShop = zooShop;
	}
	
	public List <AnimalShop> findBySex(List<AnimalShop> zooShop, Sex sex){
		List<AnimalShop> selectedAnimals = zooShop.stream()
				.filter(s -> sex.equals(s.getSex()))
                .collect(Collectors.toList());
        return selectedAnimals;
	}
	
	public List<AnimalShop> sortByFood(List<AnimalShop> animalShopList) {
		System.out.println(animalShopList);
        Comparator<AnimalShop> comparator = Comparator.comparing(AnimalShop::getFood);
              /*  (AnimalShop obj1, AnimalShop obj2)
                        -> obj2.getName().compareTo(obj1.getName());*/
        animalShopList.sort(comparator);
        return animalShopList;
    }

	
	
	 public List<AnimalShop> sortByPriceIncrease(List<AnimalShop> zooShop ){
		 zooShop.sort((o1, o2) -> (int)o1.getPrice() - (int)o2.getPrice());
		 
		 return zooShop;
		 
	 }
	 
	 public List<AnimalShop> sortByPriceDecrease(List<AnimalShop> zooShop ){
		 zooShop.sort((o1, o2) -> (int)o2.getPrice() - (int)o1.getPrice());
		 
		 return zooShop;
	 }
	 
	 public List<AnimalShop> sortByWeightIncrease(List<AnimalShop> zooShop ){
		 zooShop.sort((o1, o2) -> (int)o1.getWeight() - (int)o2.getWeight());
		 
		 return zooShop;
		 
	 }
	 
	 public List<AnimalShop> sortByWeightDecrease(List<AnimalShop> zooShop ){
		 zooShop.sort((o1, o2) -> (int)o2.getWeight() - (int)o1.getWeight());
		 
		 return zooShop;
	 }
	 
		 
}
