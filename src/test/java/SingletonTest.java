import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for EagerSingleton and LazySingleton classes.
 * Ensures that each singleton behaves correctly with valid and invalid input.
 */
public class SingletonTest {

    /**
     * Tests that EagerSingleton returns the correct instances and IDs.
     */
    @Test
    public void testEagerSingletonInstances() {
        EagerSingleton s0 = EagerSingleton.getInstance(0);
        EagerSingleton s1 = EagerSingleton.getInstance(1);
        EagerSingleton s2 = EagerSingleton.getInstance(2);

        assertEquals(0, s0.getId());
        assertEquals(1, s1.getId());
        assertEquals(2, s2.getId());

        assertSame(s0, EagerSingleton.getInstance(0));
        assertSame(s1, EagerSingleton.getInstance(1));
        assertSame(s2, EagerSingleton.getInstance(2));
    }

    /**
     * Tests that LazySingleton returns the correct instances and IDs, creating them only when accessed.
     */
    @Test
    public void testLazySingletonInstances() {
        LazySingleton s0 = LazySingleton.getInstance(0);
        LazySingleton s1 = LazySingleton.getInstance(1);
        LazySingleton s2 = LazySingleton.getInstance(2);

        assertEquals(0, s0.getId());
        assertEquals(1, s1.getId());
        assertEquals(2, s2.getId());

        assertSame(s0, LazySingleton.getInstance(0));
        assertSame(s1, LazySingleton.getInstance(1));
        assertSame(s2, LazySingleton.getInstance(2));
    }

    /**
     * Tests that EagerSingleton throws an exception for invalid (negative) index.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testEagerSingletonInvalidIndexNegative() {
        EagerSingleton.getInstance(-1);
    }

    /**
     * Tests that EagerSingleton throws an exception for index >= 3.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testEagerSingletonInvalidIndexTooHigh() {
        EagerSingleton.getInstance(3);
    }

    /**
     * Tests that LazySingleton throws an exception for invalid (negative) index.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testLazySingletonInvalidIndexNegative() {
        LazySingleton.getInstance(-1);
    }

    /**
     * Tests that LazySingleton throws an exception for index >= 3.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testLazySingletonInvalidIndexTooHigh() {
        LazySingleton.getInstance(3);
    }
}


