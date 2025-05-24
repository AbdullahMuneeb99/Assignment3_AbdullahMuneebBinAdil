import java.util.Arrays;
import java.util.List;

public class JurassicAnimalFactory implements AnimalAbstractFactory {
    public String getEra() {
        return "Jurassic";
    }

    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(
                new Stegosaurus(),
                new Allosaurus()
        );
    }

    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(
                new Plesiosaurus()
        );
    }

    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(
                new Pterodactylus()
        );
    }
}
