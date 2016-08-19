package il.co.ArrayListNew;

//import il.co.ArrayListNew.ArrayListNew;;

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
		
		for(Iterator<String> iter = mass1.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 
		System.out.println("-------------------------");
//----------------------------------------------------------------------------------------
		ArrayListNew<Integer> mass2 = new ArrayListNew<Integer>(5);
		mass2.add(11);
		mass2.add(22);
		mass2.add(33);
		mass2.add(44);
		mass2.set(2, 333);
		for(Iterator<Integer> iter = mass2.getIterator(); iter.hasNext();){
	         Integer name = (Integer)iter.next();
	         System.out.println("Name : " + name);
	      } 

	}

}
