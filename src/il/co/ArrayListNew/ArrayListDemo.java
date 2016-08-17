package il.co.ArrayListNew;

import java.util.logging.Logger;

//import il.co.ArrayListNew.ArrayListNew;;

public class ArrayListDemo {

	private final static Logger LOGGER = Logger.getLogger(Logger.class.getName()); 
	public static void main(String[] args) {
		LOGGER.info("Program has been started");
		try {
			throw new TestException("bla-bla-bla!", new TestException());
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayListNew mass1 = new ArrayListNew(5);
		System.out.println(mass1);
		mass1.add("Hello World(0)!");
		
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
		
		System.out.println(mass1.size()+" Last");
		
		System.out.println(  mass1.lenght() );
		mass1.add("Duckburg ()6");
		
		for(Iterator iter = mass1.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	    } 
		LOGGER.warning("______________________________");
		
	}

}
