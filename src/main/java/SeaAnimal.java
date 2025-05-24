/**
 * Abstract class for all sea animals.
 * Defines swimming behavior.
 */
public abstract class SeaAnimal extends Animal {
    public SeaAnimal(String name) {
        super(name);
    }

    /**
     * Returns a description of how the sea animal swims.
     * @return swimming behavior description
     */
    public abstract String getSwimming();
}
