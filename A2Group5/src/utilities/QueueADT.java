package utilities;

import java.io.Serializable;
import java.util.NoSuchElementException;

/**
 * QueueADT.java
 *
 * 
 * Class Definition: This interface represents the public contract for the
 * implementation of Queue for the QueueADT interface. 
 */
public interface QueueADT<E> extends Serializable{

/**
 * Returns the size (number of elements) in the queue 
 * Precondition: A valid queue object exists
 * Postcondition: Returns an integer value representing the size of the queue
 * @return size of the queue
 */
	public int size();

/**
 * Determines if a queue is empty or not
 * Precondition: A valid queue object exists
 * Postcondition: Returns true if the queue is empty, and false if the queue contains at least 1 element
 * @return true if empty otherwise false 
 */
	public boolean isEmpty();

/**
 * Adds an element to the end of a queue object
 * Precondition: A valid queue object exists, and the size could be 0. The element to be added to the queue is passed
 * Postcondition: Returns true if the element was successfully added to the end of the queue, and false if otherwise
 * @param newEntry the value to be added to the queue
 * @return true if newEntry is added otherwise false
 */
	public boolean enqueue(E newEntry);

/**
 * Removes an element from the beginning of a queue object
 * Precondition: A valid queue object exists
 * Postcondition: Returns the element that was removed from the queue
 * @return the element that was removed
 * @throws NoSuchElementException is thrown if there is no element in the queue
 */
	public E dequeue() throws NoSuchElementException;

/**
 * Clears all the elements in the queue
 * Precondition: A valid queue object exists
 * Postcondition: Size of the queue becomes 0
 */
	public void dequeueAll();

/**
 * Examines the front element without removing it
 * Precondition: A valid queue object exists
 * Postcondition: Returns the element at the front of the queue 
 * @return the element at the front of the queue
 * @throws NoSuchElementException is thrown if there is no element in the queue
 */
	public E peek()throws NoSuchElementException;	

}