/**
 * The {@code EagerSingleton} class implements a variation of the Singleton pattern
 * where exactly three instances are eagerly created at program startup.
 * Instances are accessed using an index (0, 1, or 2).
 */
public class EagerSingleton {
    private static final EagerSingleton[] instances = new EagerSingleton[3];

    private final int id;

    /**
     * Private constructor for the singleton instance.
     *
     * @param id the identifier of the singleton instance
     */
    private EagerSingleton(int id) {
        this.id = id;
        System.out.println("EagerSingleton " + id + " instantiated");
    }

    // Static block to eagerly create all three singleton instances
    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
        }
    }

    /**
     * Returns one of the three singleton instances by index.
     *
     * @param index the index of the singleton instance (0, 1, or 2)
     * @return the corresponding EagerSingleton instance
     * @throws IllegalArgumentException if the index is not 0, 1, or 2
     */
    public static EagerSingleton getInstance(int index) {
        if (index < 0 || index >= 3) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }
        return instances[index];
    }

    /**
     * Returns the ID of this singleton instance.
     *
     * @return the ID (0, 1, or 2)
     */
    public int getId() {
        return id;
    }
}

