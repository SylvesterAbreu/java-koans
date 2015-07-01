package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

public class AboutEquality {

	@Koan
	public void doubleEqualsTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		Object sameObject = object;
		assertEquals(object, sameObject);
		assertEquals(object, sameObject);
	}

	@Koan
	public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		assertTrue(object.equals(object));
		assertFalse(object.equals(new Object()));
	}

	@Koan
	public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual(){
		Object object = new Integer(1);
		assertSame(object, object);
		assertNotSame(object, (new Integer(1)));
		// Note: This means that for the class 'Object' there is no difference between 'equal' and 'same'
	}

	@Koan
	public void objectsNeverEqualNull(){
		assertEquals(new Object().equals(null), __);
	}

	@Koan
	public void objectsEqualThemselves(){
		Object obj = new Object();
		assertEquals(obj.equals(obj), __);
	}
}
