package Ex2_4;

import java.util.ArrayList;
import java.util.List;
/*
 * author: Pham Thi Kim Hien
 * Date : 7/9/2016
 * Version : 1.0
 * Class about information Cat
 */
public class Main {

	public static void main(String[] args) {
		
		GenericPet<Dog> dogs = new GenericPet<>();
		GenericPet<Cat> cats = new GenericPet<>();
		
		List<Dog> listDog = new ArrayList<>();
		List<Cat> listCat = new ArrayList<>();
		
		listDog.add(new Dog("BoBo"));
		listDog.add(new Dog("SuSu"));
		listDog.add(new Dog("SoDa"));
		
		listCat.add(new Cat("MiMi"));
		listCat.add(new Cat("MeoMeo"));
		listCat.add(new Cat("MyMy"));
		
		dogs.setList(listDog);
		cats.setList(listCat);
		
		System.out.println("Collection of Dog:");
		listDog.forEach((Dog dog) -> System.out.println(dog.name));
		System.out.println("=============================");
		System.out.println("Collection of Cat");
		listCat.forEach((Cat cat) -> System.out.println(cat.name));
		
 	}
}
