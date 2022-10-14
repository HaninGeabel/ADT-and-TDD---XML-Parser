/**
 * 
 */
package utilities;

import static org.junit.jupiter.api.Assertions.*;

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
	
	ListADT<E> <String> list1;

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
		list1.add(0, "A");
		assertEquals(1, list1.size();
	}

	/**
	 * Test method for {@link utilities.MyArrayList#clear()}.
	 */
	@Test
	void testClear() {
		list1.add(0, "A");
		list1.add(1, "B");
		list1.add(2, "C");
		while (list1.size > 0) {
			list1.remove(list1.size()-1);
		}
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
		}
		catch (NullPointerException e){
			assertTrue(true);
			}
	}
	
	void testAddIntEIndexOutOfBoundsNegative() {
		try {
			list1.add(-1, "A");
			fail("IndexOutOfBoundsException didn't throw");
		}
		catch (IndexOutOfBoundsException e){
			assertTrue(true);
			}
	}
	
	void testAddIntEIndexOutOfBoundsGreaterThanSize() {
		try {
			list1.add(1, "A");
			fail("IndexOutOfBoundsException didn't throw");
		}
		catch (IndexOutOfBoundsException e){
			assertTrue(true);
			}
	}
	
	/**
	 * Test method for {@link utilities.MyArrayList#add(java.lang.Object)}.
	 */
	@Test
	void testAddE() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#addAll(utilities.ListADT)}.
	 */
	@Test
	void testAddAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#get(int)}.
	 */
	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#remove(int)}.
	 */
	@Test
	void testRemoveInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveE() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	void testSet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#contains(java.lang.Object)}.
	 */
	@Test
	void testContains() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#toArray(E[])}.
	 */
	@Test
	void testToArrayEArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyArrayList#toArray()}.
	 */
	@Test
	void testToArray() {
		fail("Not yet implemented");
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
			fail("NoSUchElementexception didn't throw")
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
		Iterator <String> it = list1.iterator();
		assertTrue(it.hasNext());
		int i = 0;
		while (it.hasNext()) {
			assertEquals(list1.get(i), it.next());
			i++;
		}
	}

}
