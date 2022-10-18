/**
 * 
 */
package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Aster
 *
 */
class MyArrayListTest {

	ListADT<E><String>list1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		list1 = new MyArrayList<>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		list1 = null;
	}

	/**
	 * Test method for {@link utilities.MyArrayList#size()}.
	 */
	@Test
	void testSize() {
		list1.add("A");
		assertEquals(1, list1.size();
	}

	/**
	 * Test method for {@link utilities.MyArrayList#clear()}.
	 */
	@Test
	void testClear() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.clear();
		assertEquals(0, list1.size());
	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(int, java.lang.Object)}.
	 */
	@Test
	void testAddIntEEmptyList() {
		boolean actual = list1.add(0, "A");
		assertTrue(actual);
		assertEquals(1, list1.size());
		assertEquals("A", list1.get(0));
	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(int, java.lang.Object)}.
	 */
	@Test
	void testAddIntENonEmptyListStart() {
		list1.add("B");
		boolean actual = list1.add(0, "A");
		assertTrue(actual);
		assertEquals(2, list1.size());
		assertEquals("A", list1.get(0));
	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(int, java.lang.Object)}.
	 */
	@Test
	void testAddIntENonEmptyListMiddle() {
		list1.add("A");
		list1.add("C");
		boolean actual = list1.add(1, "B");
		assertTrue(actual);
		assertEquals(3, list1.size());
		assertEquals("B", list1.get(1));
	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(int, java.lang.Object)}.
	 */
	@Test
	void testAddIntENonEmptyListEnd() {
		list1.add("A");
		list1.add("B");
		boolean actual = list1.add(2, "C");
		assertTrue(actual);
		assertEquals(3, list1.size());
		assertEquals("C", list1.get(2));
	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(int, java.lang.Object)}.
	 */
	@Test
	void testAddIntENullPointer() {
		try {
			list1.add(0, null);
			fail("NullPointerException didn't throw");
		} catch (NullPointerException e) {
			assertTrue(true);
		}
	}

	void testAddIntEIndexOutOfBoundsNegative() {
		try {
			list1.add(-1, "A");
			fail("IndexOutOfBoundsException didn't throw");
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	void testAddIntEIndexOutOfBoundsGreaterThanSize() {
		try {
			list1.add(1, "A");
			fail("IndexOutOfBoundsException didn't throw");
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(java.lang.Object)}.
	 */
	@Test
	void testAddEEmptyList() {
		boolean actual = list1.add("A");
		assertTrue(actual);
		assertEquals(1, list1.size());
		assertEquals(list1.get(0), "A");

	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(java.lang.Object)}.
	 */
	@Test
	void testAddENonEmptyList() {
		list1.add("A");
		boolean actual = list1.add("B");
		assertTrue(actual);
		assertEquals(2, list1.size());
		assertEquals(list1.get(1), "B");

	}

	/**
	 * Test method for {@link utilities.MyArrayList#add(java.lang.Object)}.
	 */
	@Test
	void testAddENullPointerException() {
		try {
			list1.add(null);
			fail("NullPointerException didn't throw");
		} catch (NullPointerException e) {
			assertTrue(true);
		}

	}

	/**
	 * Test method for {@link utilities.MyArrayList#addAll(utilities.ListADT)}.
	 */
	@Test
	void testAddAll() {//ALSO ADD A TEST FOR A DLL
		ArrayList<String> toAdd = new ArrayList<String>();
				toAdd.add("A");
				toAdd.add("B");
				toAdd.add("C");
		
				list1.addAll(toAdd);
				
				assertEquals(3, length);
				assertEquals(list[0], "A");
				assertEquals(list[1], "B");
				assertEquals(list[2], "C");		
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#addAll(utilities.ListADT)}.
	 */
	@Test
	void testAddAllNullPointerException() {
		ArrayList<String> toAdd = new ArrayList<String>();
				toAdd.add("A");
				toAdd.add("B");
				try {
				toAdd.add(null); 
				fail("NullPointerException didn't throw");
				}
				catch (NullPointerException e) {
					assertTrue(true);
				}
				try {
					list1.addAll(toAdd);
					fail("NullPointerException didn't throw");
				}
				catch (NullPointerException e) {
					assertTrue(true);
				}
		
	}

	/**
	 * Test method for {@link utilities.MyArrayList#get(int)}.
	 */
	@Test
	void testGetInBounds() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		String get = list1.get(1);
		assertEquals("B", get);
	}

	/**
	 * Test method for {@link utilities.MyArrayList#get(int)}.
	 */
	@Test
	void testGetOutOfBoundsGreater() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
			String get = list1.get(5);
			fail("IndexOutOfBoundsException didn't throw");
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#get(int)}.
	 */
	@Test
	void testGetOutOfBoundsLower() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
			String get = list1.get(-1);
			fail("IndexOutOfBoundsException didn't throw");
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link utilities.MyArrayList#remove(int)}.
	 */
	@Test
	void testRemoveIntStartOfList() {
		list1.add("A");
		list1.add("B");
		list1.remove(0);
		
		assertEquals(list1.get(0), "B");
		assertEquals(1, list1.size());
		
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(int)}.
	 */
	@Test
	void testRemoveIntEndOfList() {
		list1.add("A");
		list1.add("B");
		list1.remove(1);
		
		assertEquals(list1.get(0), "A");
		assertEquals(1, list1.size());
		
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(int)}.
	 */
	@Test
	void testRemoveIntMiddleOfList() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.remove(1);
		
		assertEquals(list1.get(0), "A");
		assertEquals(list1.get(1), "C");
		assertEquals(list1.get(2), list1.size());
		
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(int)}.
	 */
	@Test
	void testRemoveIntIndexOutOfBoundsLower() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
		list1.remove(-1);
		fail("IndexOutOfBoundsException didn't throw");
		}
		catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
		
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(int)}.
	 */
	@Test
	void testRemoveIntIndexOutOfBoundsGreater() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
		list1.remove(5);
		fail("IndexOutOfBoundsException didn't throw");
		}
		catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
		
	}

	/**
	 * Test method for {@link utilities.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveEStart() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		list1.remove("A");
		
		assertEquals(list1.get(0), "B");
		assertEquals(list1.get(1), "C");
		assertEquals(2, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveEMiddle() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		list1.remove("B");
		
		assertEquals(list1.get(0), "A");
		assertEquals(list1.get(1), "C");
		assertEquals(2, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveEEnd() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		list1.remove("C");
		
		assertEquals(list1.get(0), "A");
		assertEquals(list1.get(1), "B");
		assertEquals(2, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveEDuplicate() {
		list1.add("A");
		list1.add("B");
		list1.add("A");
		list1.add("C");
		
		list1.remove("A");
		
		assertEquals(list1.get(0), "B");
		assertEquals(list1.get(1), "A");
		assertEquals(list1.get(2), "C");
		assertEquals(3, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveENonexistant() {
		list1.add("A");
		list1.add("B");
		list1.add("A");
		list1.add("C");
		
		list1.remove("D");//This should change nothing.
		
		assertEquals(list1.get(0), "A");
		assertEquals(list1.get(1), "B");
		assertEquals(list1.get(2), "C");
		assertEquals(3, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveENullPointerException() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
		list1.remove(null);
		fail("NullPointerException didn't throw");
		}
		catch (NullPointerException e) {
		assertTrue(true);
		}
	}

	/**
	 * Test method for {@link utilities.MyArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	void testSetFirst() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.set(0, "D");
		assertEquals(list1.get(0), "D");
		assertEquals(list1.get(1), "B");
		assertEquals(list1.get(2), "C");
		assertEquals(3, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	void testSetMiddle() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.set(1, "D");
		assertEquals(list1.get(0), "A");
		assertEquals(list1.get(1), "D");
		assertEquals(list1.get(2), "C");
		assertEquals(3, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	void testSetEnd() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.set(2, "D");
		assertEquals(list1.get(0), "A");
		assertEquals(list1.get(1), "B");
		assertEquals(list1.get(2), "D");
		assertEquals(3, list1.size());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	void testSetNullPointer() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
		list1.set(2, null);
		fail("NullPointerException not thrown");
		}
		catch (NullPointerException e) {
			assertTrue(true);
		}
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	void testSetIndexOutOfBoundsLower() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
		list1.set(-1, "D");
		fail("IndexOutOfBoundsException not thrown");
		}
		catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	void testSetIndexOutOfBoundsGreater() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
		list1.set(5, "D");
		fail("IndexOutOfBoundsException not thrown");
		}
		catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link utilities.MyArrayList#isEmpty()}.
	 */
	@Test
	void testIsEmptyTrue() {
		assertEquals(true, list1.isEmpty());
	}

	void testIsEmptyFalse() {
		list1.add(0, "A");
		assertEquals(false, list1.isEmpty());
	}

	/**
	 * Test method for {@link utilities.MyArrayList#contains(java.lang.Object)}.
	 */
	@Test
	void testContainsTrue() {
		list1.add("A");
		assertEquals(true, list1.contains("A"));
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#contains(java.lang.Object)}.
	 */
	@Test
	void testContainsFalse() {
		list1.add("A");
		assertEquals(false, list1.contains("B"));
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#contains(java.lang.Object)}.
	 */
	@Test
	void testContainsManyTrue() {
		list1.add("A");
		list1.add("B");
		list1.add("A");
		assertEquals(true, list1.contains("A"));
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#contains(java.lang.Object)}.
	 */
	@Test
	void testContainsNullPointer() {
		list1.add("A");
		try {
			list1.contains(null));
		fail("NullPointerException not thrown");
		}
		catch (NullPointerException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link utilities.MyArrayList#toArray(E[])}.
	 */
	@Test
	void testToArrayEArray() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.toArray(E[] toHold);
		assertEquals(toHold[0], "A");
		assertEquals(toHold[1], "B");
		assertEquals(toHold[2], "C");
		assertEquals(3, toHold.length());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#toArray(E[])}.
	 */
	@Test
	void testToArrayEArrayEmpty() {
		list1.toArray(E[] toHold);
		assertEquals(0, toHold.length());
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#toArray(E[])}.
	 */
	@Test
	void testToArrayEArrayNullPointer() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		try {
		list1.toArray(null);
		fail("NullPointerException not thrown");
		}
		catch(NullPointerException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link utilities.MyArrayList#toArray()}.
	 */
	@Test
	void testToArray() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		Object[] = list1.toArray();
		assertEquals(Object[0], "A");
		assertEquals(Object[1], "B");
		assertEquals(Object[2], "C");
		assertEquals(3, Object.length());
	}

	/**
	 * Test method for {@link utilities.MyArrayList#iterator()}.
	 */
	@Test
	void testIteratorEmpty() {
		Iterator <String> it = list1.iterator();
		assertFalse(it.hasNext());
		try {
			it.next();
			fail("NoSuchElementexception didn't throw")
		}
		catch (NoSuchElementException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link utilities.MyArrayList#iterator()}.
	 */
	@Test
	void testIteratorNotEmpty() {
		list1.add("A");
		list1.add("B");
		list1.add("C");
		Iterator<String> it = list1.iterator();
		assertTrue(it.hasNext());
		int i = 0;
		while (it.hasNext()) {
			assertEquals(list1.get(i), it.next());
			i++;
		}
	}

}
