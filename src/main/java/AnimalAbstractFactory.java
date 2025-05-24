import java.util.List;

/**
 * Abstract factory interface for creating animal exhibits by era.
 * Each factory is responsible for providing land, sea, and sky animals.
 */
public interface AnimalAbstractFactory {

    /**
     * Returns the era name associated with the factory.
     * @return the name of the era
     */
    String getEra();

    /**
     * Creates a list of land animals for the exhibit.
     * @return list of land animals
     */
    List<LandAnimal> createLandAnimals();

    /**
     * Creates a list of sea animals for the exhibit.
     * @return list of sea animals
     */
    List<SeaAnimal> createSeaAnimals();

    /**
     * Creates a list of sky animals for the exhibit.
     * @return list of sky animals
     */
    List<SkyAnimal> createSkyAnimals();
}
