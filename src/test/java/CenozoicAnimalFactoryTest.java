import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for the CenozoicAnimalFactory.
 * Verifies correct era, animals created, and their attributes.
 */
public class CenozoicAnimalFactoryTest {

    /**
     * Tests the output of the CenozoicAnimalFactory, including lists of animals
     * and their properties. Also prints formatted exhibition sections.
     */
    @Test
    public void testCenozoicFactoryOutput() {
        AnimalAbstractFactory factory = new CenozoicAnimalFactory();
        assertEquals("Cenozoic", factory.getEra());

        System.out.println("You are in the " + factory.getEra() + " exhibition");
        System.out.println("===== " + factory.getEra() + " land animals section =====");
        List<LandAnimal> landAnimals = factory.createLandAnimals();
        for (LandAnimal a : landAnimals) {
            System.out.println("A " + a.getName() + " " + a.getWalking());
        }

        System.out.println("===== " + factory.getEra() + " sea animals section =====");
        List<SeaAnimal> seaAnimals = factory.createSeaAnimals();
        for (SeaAnimal a : seaAnimals) {
            System.out.println("A " + a.getName() + " " + a.getSwimming());
        }

        System.out.println("===== " + factory.getEra() + " sky animals section =====");
        List<SkyAnimal> skyAnimals = factory.createSkyAnimals();
        for (SkyAnimal a : skyAnimals) {
            System.out.println("A " + a.getName() + " " + a.getFlying());
        }

        System.out.println("Thank you for visiting the " + factory.getEra() + " exhibition");

        // Assertions to validate size and names
        assertEquals(3, landAnimals.size());
        assertEquals("Mammoth", landAnimals.get(0).getName());
        assertEquals("Cave lion", landAnimals.get(1).getName());
        assertEquals("Woolly rhino", landAnimals.get(2).getName());

        assertEquals(2, seaAnimals.size());
        assertEquals("Otodus", seaAnimals.get(0).getName());
        assertEquals("Whale", seaAnimals.get(1).getName());

        assertEquals(1, skyAnimals.size());
        assertEquals("Argentavis", skyAnimals.get(0).getName());
    }
}




