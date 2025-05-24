import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for the JurassicAnimalFactory.
 * Verifies correct era, animals created, and their attributes.
 */
public class JurassicAnimalFactoryTest {

    /**
     * Tests the output of the JurassicAnimalFactory, including lists of animals
     * and their properties. Also prints formatted exhibition sections.
     */
    @Test
    public void testJurassicFactoryOutput() {
        AnimalAbstractFactory factory = new JurassicAnimalFactory();
        assertEquals("Jurassic", factory.getEra());

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
        assertEquals(2, landAnimals.size());
        assertEquals("Stegosaurus", landAnimals.get(0).getName());
        assertEquals("Allosaurus", landAnimals.get(1).getName());

        assertEquals(1, seaAnimals.size());
        assertEquals("Plesiosaurus", seaAnimals.get(0).getName());

        assertEquals(1, skyAnimals.size());
        assertEquals("Pterodactylus", skyAnimals.get(0).getName());
    }
}


