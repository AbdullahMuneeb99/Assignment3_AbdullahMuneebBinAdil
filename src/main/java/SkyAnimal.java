/**
 * Abstract class for all sky animals.
 * Defines flying behavior.
 */
public abstract class SkyAnimal extends Animal {
    public SkyAnimal(String name) {
        super(name);
    }

    /**
     * Returns a description of how the sky animal flies.
     * @return flying behavior description
     */
    public abstract String getFlying();
}
