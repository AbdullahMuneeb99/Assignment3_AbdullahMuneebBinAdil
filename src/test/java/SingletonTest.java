import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

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

    @Test(expected = IllegalArgumentException.class)
    public void testEagerSingletonInvalidIndexNegative() {
        EagerSingleton.getInstance(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEagerSingletonInvalidIndexTooHigh() {
        EagerSingleton.getInstance(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLazySingletonInvalidIndexNegative() {
        LazySingleton.getInstance(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLazySingletonInvalidIndexTooHigh() {
        LazySingleton.getInstance(3);
    }
}

