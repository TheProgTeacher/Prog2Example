package basics;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
	public static void main(String[] args) {
		ArrayList<String> pets = new ArrayList<>();
		pets.add("Cat");
		pets.add("Dog");
		pets.add("Hamster");
		pets.add("Snake");
		
		for(String s : pets)
			out.println(s);
		
		out.println("----------");
		
		out.println(pets.get(1));
		pets.set(1, "Rat");
		out.println(pets.get(1));
		
		out.println("----------");
		
		LinkedList<String> myNewPets = new LinkedList<>(pets);
		for(String s : myNewPets)
			out.println(s);
	}
}
