/**
 * Abstract class for all land animals.
 * Defines walking behavior.
 */
public abstract class LandAnimal extends Animal {
    public LandAnimal(String name) {
        super(name);
    }

    /**
     * Returns a description of how the land animal walks.
     * @return walking behavior description
     */
    public abstract String getWalking();
}

