import java.util.Arrays;
import java.util.List;

/**
 * Factory class responsible for creating Jurassic era animals.
 * Implements the AnimalAbstractFactory interface.
 */
public class JurassicAnimalFactory implements AnimalAbstractFactory {

    /**
     * Returns the era this factory represents.
     *
     * @return A string representing the Jurassic era.
     */
    public String getEra() {
        return "Jurassic";
    }

    /**
     * Creates and returns a list of Jurassic land animals.
     *
     * @return List of land animals from the Jurassic era.
     */
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(
                new Stegosaurus(),
                new Allosaurus()
        );
    }

    /**
     * Creates and returns a list of Jurassic sea animals.
     *
     * @return List of sea animals from the Jurassic era.
     */
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(
                new Plesiosaurus()
        );
    }

    /**
     * Creates and returns a list of Jurassic sky animals.
     *
     * @return List of sky animals from the Jurassic era.
     */
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(
                new Pterodactylus()
        );
    }
}

