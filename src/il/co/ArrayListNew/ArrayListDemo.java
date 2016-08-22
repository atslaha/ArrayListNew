package il.co.ArrayListNew;

//import il.co.ArrayListNew.ArrayListNew;;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayListNew<String> mass1 = new ArrayListNew<String>(5);
		System.out.println(mass1);
		mass1.add("Hello World(0)!");
		//mass1.add("Hello World(0)!");
		
		mass1.set(0, "Hey guys!(0)");
		mass1.add("Hello  World!(1)");
		mass1.add("Hello Sport!()2");
		mass1.add("Hello++ World!(3)");
		mass1.add("Hello Sport!()4");
		System.out.println(mass1.get(2));
		System.out.println(mass1.size());
		
		//mass1.remove(0);
		System.out.println(mass1.get(1));
		System.out.println(mass1.size());
		
		System.out.println(  mass1.lenght() );
		mass1.add(2, "Hello Bentley()3!");
		System.out.println(  mass1.lenght() );
		System.out.println(mass1.get(0));
		System.out.println(mass1.get(1));
		System.out.println(mass1.get(2));
		System.out.println(mass1.get(3));
		System.out.println(mass1.get(4));
		mass1.add("@!@!@!@!@!@!@!@!()5");
		System.out.println(mass1.get(5));
		System.out.println(mass1.size());
		mass1.remove(3);
		
		//System.out.println();
		System.out.println();
		System.out.println(mass1.size()+" Last");
		
		System.out.println(  mass1.lenght() );
		mass1.add("Duckburg ()6");
		mass1.set(6,"Duckburg (6)");
		
		for(Iterator<String> iter = mass1.getIterator(); iter.hasNext();){
	        //mass1.remove("Duckburg (6)");
			String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 
		System.out.println("-------------------------");
//----------------------------------------------------------------------------------------
		ArrayListNew<Double> mass2 = new ArrayListNew<Double>(5);
		mass2.add(11.0);
		mass2.add(22.0);
		mass2.add(33.0);
		mass2.add(44.0);
		mass2.set(2, 333.0);
		for(Iterator<Double> iter = mass2.getIterator(); iter.hasNext();){
	       //mass2.remove(22.0); 
			Double name = (Double)iter.next();
	         System.out.println("Name : " + name);
	      } 
		
		System.out.println("-------------------------");
		Iterator it = mass2.getIterator();
		while (it.hasNext()){
			mass2.remove(22.0);
			System.out.println(it.next());
		}
		
//		System.out.println("-------------------------");
//		for(Integer t: mass2){
//			System.out.println(t);
//		}

	}

}
