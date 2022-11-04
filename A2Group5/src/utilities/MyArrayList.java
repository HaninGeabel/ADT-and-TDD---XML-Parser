package utilities;

import java.util.NoSuchElementException;

public class MyArrayList<E> implements  ListADT<E> {

	private static final long serialVersionUID = -6641976547739553233L;
	
	Object[] array;
	int capacity;
	int size;
	
	MyArrayList(){
		size = 0;
		capacity = 5;
		array = new Object[capacity];
	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public void clear() {
		array = null;
	}

	@Override
	public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
		Iterator<E> iterator = new ArrayBasedIterator();
		int pos = 0;
		Object temp1 = "";
		Object temp2 = "";
		temp1 = array[index];
		try {
		array[index] = toAdd;
		while (iterator.hasNext()) { //iterates through list and slides each value over by one after the insertion point
			pos++;
			while (pos > index || iterator.hasNext()){
			pos++;
			temp2 = array[index];
			array[index] = temp1;
			temp1 = temp2;
			}
		}
		}
			catch (NullPointerException e) {
				System.out.println("Error: Null items cannot be added.");
				return false;
		} 	catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Index out of bounds");
			return false;
		
	}
		return true;
	}

	@Override
	public boolean add(E toAdd) throws NullPointerException {
		try {
		if ((array.size() + 1) >= capacity) {
		array[size]=toAdd;
		size++;
		return true;
		}
		else { //If the array isn't big enough, we make a new one and copy the first into it
			Object[] newArray = new Object[array.size() + 1];
			for (int i = 0; 1 < array.length; i++) {
				newArray[i] = array[i];
			}
			newArray[size++]=toAdd;
			array = newArray;
			return true;
		}
	} 		catch (NullPointerException e) {
		System.out.println("Error: Null items cannot be added.");
		return false;
	}
	}

	@Override
	public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
		try {
			for (Object add: toAdd) {
				array.add(add);
			}
			return true;
		}
			catch (NullPointerException e) {
				System.out.println("Error: Null list cannot be added.");
				return false;
			}
		}
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		try {
			return array[index];
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Index out of bounds");
		}
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		int removed = array[i];
		try {
			for (int i = index; i < size-1; i++) {
				array[i] = array[i+1];//This just goes through the array, starting at the index, and overwrites each element with the next element
			}
			size--;
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Index out of bounds");
		}
		return removed;
	}

	@Override
	public E remove(E toRemove) throws NullPointerException {
		Iterator<E> iterator = new ArrayBasedIterator();
		Object removed;
		int pos = 0;
		try {
			while (iterator.hasNext()) {
				pos++;
				if (array[i] == toRemove) {
					removed = array[pos];
					for (int j = i; j < size-1; j++) {//Once a match is located, shift everything over one
				array[j] = array[j+1];//This just goes through the array, starting at the index, and overwrites each element with the next element
			}
				}
			}
			size--;
		}
		catch (NullPointerException e) { 
			System.out.println("Error: Input value cannot be null");
		}
		return removed;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		Iterator<E> iterator = new ArrayBasedIterator();
		Object removed;
		int pos = 0;
		try { 
			while (iterator.hasNext()) {
			pos++;
			if (pos == index) {
			removed = array[pos];
			array[pos] = toChange;
			}
			}
		} catch (NullPointerException e) { System.out.println("Error: Input value cannot be null");
		} catch (IndexOutOfBoundsException e) { System.out.println("Error: Index out of bounds");
	} return removed;
	}
			
	@Override
	public boolean isEmpty() {
		boolean isEmpty = (list.size==0);
		return isEmpty;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		Iterator<E> iterator = array.iterator();
		int pos = 0;
		try { 
			while (iterator.hasNext()) {
				if (iterator.next().equals("toFind")) {
					return true;
			}
		} 
		} catch (NullPointerException e) { System.out.println("Error: Input value cannot be null");
		return false;
	}
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		try {
		Iterator<E> iterator = array.iterator();
		int size = array.size();
		int pos = 0;
		toHold = new Object[size];
		while (iterator.hasNext()) {
			toHold[pos] = array[pos];
			pos++;
		}
		return toHold;
		} catch (NullPointerException e) { System.out.println("Error: Input array cannot be null");
		return false; 
		}
	}

	@Override
	public Object[] toArray() {
		try {
		Iterator<E> iterator = array.iterator();
		int size = array.size();
		int pos = 0;
		Object[] newArray = new Object[size];
		while (iterator.hasNext()) {
			newArray[pos] = array[pos];
			pos++;
		}
		return newArray;
		} catch (NullPointerException e) { System.out.println("Error: Input array cannot be null");
		return false; 
		}
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = new ArrayBasedIterator();
		return iterator;
	}

	//Should these be implemented? I have them in the class below
//	@Override
//	public boolean hasNext() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public E next() throws NoSuchElementException {
//		// TODO Auto-generated method stub
//		return null;
//	}

private class ArrayBasedIterator implements Iterator<E>{

	//Atributes 
	
	private E[] copyeOfElement = new ArrayBasedIterator(); 
	private int pos;
	
	public ArrayBasedIterator() {
		copyeOfElement = (E[]) (new Object[size()]);
		System.arraycopy(array, 0, copyeOfElement, 0, copyeOfElement.length);
	}

	@Override
	public boolean hasNext() {
		return (pos < copyeOfElement.length());
	}

	@Override
	public E next() throws NoSuchElementException {
		return (E) copyeOfElement[pos++];
		
	}
	
}

}
