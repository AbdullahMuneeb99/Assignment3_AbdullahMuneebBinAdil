import java.util.Arrays;
import java.util.List;

/**
 * Factory class responsible for creating Cenozoic era animals.
 * Implements the AnimalAbstractFactory interface.
 */
public class CenozoicAnimalFactory implements AnimalAbstractFactory {

    /**
     * Returns the era this factory represents.
     *
     * @return A string representing the Cenozoic era.
     */
    public String getEra() {
        return "Cenozoic";
    }

    /**
     * Creates and returns a list of Cenozoic land animals.
     *
     * @return List of land animals from the Cenozoic era.
     */
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(
                new Mammoth(),
                new CaveLion(),
                new WoollyRhino()
        );
    }

    /**
     * Creates and returns a list of Cenozoic sea animals.
     *
     * @return List of sea animals from the Cenozoic era.
     */
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(
                new Otodus(),
                new Whale()
        );
    }

    /**
     * Creates and returns a list of Cenozoic sky animals.
     *
     * @return List of sky animals from the Cenozoic era.
     */
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(
                new Argentavis()
        );
    }
}

