package test;

import data.Cat;
import data.FelineInterface;
import persistance.FelineRepository;
import persistance.FelineRepositoryInterface;

public class TestApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		//FelineInterface cat = new Cat(1, "Murzik", "British", 2018);
		
		//FelineInterface cloned = cat.clone();
		
		//System.out.println(cat);
		//System.out.println(cloned);

		
		
		FelineRepositoryInterface newFile = (FelineRepositoryInterface) new FelineRepository();
		((FelineRepository) newFile).generate();
		
		FelineInterface original = newFile.findById(22);
						original.setYear(1900);
						original.setId(10000);
						newFile.delete(original);
						
						
		System.out.println(newFile.findAll());
		
		//System.out.println(newFile.findByName("Шурсик"));
		//System.out.println(newFile.findByRace("Британская"));
		
	}

}
