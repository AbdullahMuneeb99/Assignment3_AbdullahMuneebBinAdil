/**
 * Base abstract class for all animals in the exhibit.
 * Stores a common name attribute.
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the animal.
     * @return name of the animal
     */
    public String getName() {
        return name;
    }
}