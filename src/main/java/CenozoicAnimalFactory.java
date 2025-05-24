import java.util.Arrays;
import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    public String getEra() {
        return "Cenozoic";
    }

    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(
                new Mammoth(),
                new CaveLion(),
                new WoollyRhino()
        );
    }

    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(
                new Otodus(),
                new Whale()
        );
    }

    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(
                new Argentavis()
        );
    }
}
