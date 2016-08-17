package il.co.ArrayListNew;

import java.io.IOException;
import java.util.*;

import il.co.ArrayListNewExceptions.IllegalIndexException;
import il.co.ArrayListNewExceptions.InitializationException;

public class ArrayListNew<E> implements Container {
	
	
	private Object[] mass;
	private int index;
		
	public ArrayListNew(){
		mass = new Object[10];
	}
	
	public ArrayListNew(int capacity) throws InitializationException{
		
			if (capacity <0){
				throw new InitializationException();
			}
			mass = new Object[capacity];
	}
	
	public Object get(int index){
		checkIndex(index);
		return mass[index];
	}
	
	private void checkIndex(int index) {
		if (index<0 || index>=this.index){
			throw new IllegalIndexException();
		}
    }
	
	public void set(int index, Object value){
		checkIndex(index);
		mass[index]=value;		
	}

	public void add(Object value){
		if(index == mass.length){
			growArray();
		}
			mass[index]=value;
			index++;
		}
	
	public boolean add(int indexx, Object value){
		checkIndex(indexx);
		if (index == mass.length)
			growArray();
		System.arraycopy(mass, indexx, mass, indexx+1, index-indexx);
		mass[indexx]=value;
		index++;
		return true;
	}
	
	public boolean remove(int indexx){
		checkIndex(indexx);
		
		System.arraycopy(mass, indexx+1, mass, indexx, index - indexx-1);
		mass[index-1]=null;
		index--;
		return true;
	}
	
	public void growArray(){
		Object[] newArray = new Object[mass.length * 2];
		System.arraycopy(mass, 0, newArray, 0, index );
		mass = newArray;
	}
	
	public int size(){
		return index;
	}
	
	public int lenght(){
		int length = mass.length;
		return length;
	}
	
	@Override
	public Iterator getIterator() {
		 return new NameIterator();
	}
	
		
	private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < mass.length){
	            return true;
	         }
	         else return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return mass[index++];
	         }
	         else return null;
	      }		
	   }

}
