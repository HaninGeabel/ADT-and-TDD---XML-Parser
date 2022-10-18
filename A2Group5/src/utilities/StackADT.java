package utilities;

import java.io.Serializable;
import java.util.EmptyStackException;


/**
 * StackADT.java
 *  @author Hanin
 *  
 * Class Definition: StackADT interface implements Serializable 
 * and  represents the public contract for the
 * implementation of Stack for StackADT interface
 *
 *@param <E> The type of elements this list holds.
 */

public interface StackADT<E> extends Serializable {
	
	
	/**
	 *  Pushes an item onto the top of this stack.
	 *  Precondition: A valid stack object that needs to push into it it could be an empty stack with depth 0. An object the needs to be pushed into the stack.
	 *  Postcondition: Returns an true if the object has pushed or false if it is not.
	 * @param the object that should be added to the stack
	 * @return the true if the object has pushed or false if it is not 
	 * 			
	 */
	public boolean push(E obj); 
	
	/**
	 *  Removes the object that is on the top of the stack.
	 *  In the implementation it may throws exception if the stack is empty
	 *  in this case we need to check if the stack is empty before call the pop function.
	 *  Precondition: A valid stack object that needs to push into it. it could be an empty stack with depth 0.
	 *  Postcondition: Returns an object that is pop from the stack 
	 * @return the object that has been removed 
	 * 	@throws EmptyStackException
	 * if the stack is empty 
	 * i.e. <code>(!stackE.isEmpty())</code> will
	 *  return <code>E</code> otherwise it will throw EmptyStackException	
	 * 
	 */
	public E pop() throws EmptyStackException; 
	
	
	/**
	 *  Looks at the object at the top of this stack without removing 
	 * it from the stack.It could throw exception if the stack is empty
	 * In the implementation it may throws exception if the stack is empty.
	 * Precondition: A valid stack object that needs to look into it.
	 * Postcondition: Returns an object that is on the top of stack without remove it. 
	 * or it will throws Exception EmptyStackException if the stack empty 
	 * if the stack is empty it will throw exception 
	 *  i.e.(stackE.isEmpty()) will return <code>E</code>
	 *   @return <code>E</code>
	 * @throws EmptyStackException
	 * 
	 * 
	 */
	public E peek() throws EmptyStackException;

	/**
	 * Looks if the stack has elements or not 
	 * it returns true if stack has an object or false otherwise.
	 * Precondition: A valid stack object that needs to look into it.
	 * Postcondition: Returns true if stack has an object or false otherwise.
	 * @return true if stack has an object or false otherwise
	 */
	public boolean isEmpty(); 
	

	
}
