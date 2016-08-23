package il.co.ArrayListNew;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.*;

public class TaskRandomizer<E> {
	

	public static void main(String[] args) {
		
		String[] taskDescriptions = {"Go to the shop!", "Buy the book!", "Have a lunch!"};		
		List<String> namesList = Arrays.asList(new String[]{"Bill", "Garry", "Smith", "Ted", "Marven", "Nick", "Uzi", "David", "Matt"});
		ArrayListNew<String> randomNames = new ArrayListNew<String>(10);		
		
		for (int i=0;i<3;i++){
			System.out.println(taskDescriptions[i]);
			Collections.shuffle(namesList);
		//	System.out.println(namesList);
			randomNames.clear();
			     for(int b = 0;b<namesList.size();b++){
			     randomNames.add(namesList.get(b));
		         }
			         Iterator it = randomNames.getIterator();
		             while(it.hasNext()){
			         System.out.print(it.next() + ", ");
			     			
		             }	
		      System.out.println();	
		      System.out.println();
		}
		
		

	}

}
