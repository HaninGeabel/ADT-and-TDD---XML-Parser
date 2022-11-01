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
		Object temp1 = "";
		temp1 = array[index];
		array[index] = toAdd;
		for (i=index+1; i<array.size()-1; i++) { //iterates through list and slides each value over by one after the insertion point
			Object temp2 = array[index];
			array[index] = temp1;
			temp1 = temp2;
		return false;
	}

	@Override
	public boolean add(E toAdd) throws NullPointerException {
		try {
		if ((array.size() + 1) >= capacity) {
		array[size]=item;
		size++;
		return true;
		}
		else {
			Object[] newArray = new Object[array.size() + 1];
			for (int i = 0; 1 < array.length; i++) {
				newArray[i] = array[i];
			}
			newArray[size++]=item;
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
			System.out.println("Error: Null list cannot be added.");
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
			
		}
		return removed;
	}

	@Override
	public E remove(E toRemove) throws NullPointerException {
		Object removed;
		try {
			for (int i = 0; i < size-1; i++) {
				if (array[i] == toRemove) {
					removed = array[i];
					for (int j = i; j < size-1; j++) {//Once a match is located, shift everything over one
				array[j] = array[j+1];//This just goes through the array, starting at the index, and overwrites each element with the next element
			}
				}
			}
			size--;
		}
		catch (IndexOutOfBoundsException e) {
			
		}
		return removed;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = (list.size==0);
		return isEmpty;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

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
	
	private E[] copyeOfElement; 
	private int pos;  
	
	public ArrayBasedIterator() {
		copyeOfElement = (E[]) (new Object[size()]);
		//System.arraycopy(array, 0, copyeOfElement, 0, copyeOfElement.length);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}
	
}

}
