/**
 * The {@code LazySingleton} class implements a variation of the Singleton pattern
 * where up to three instances are lazily created upon first access.
 * Instances are accessed using an index (0, 1, or 2).
 */
public class LazySingleton {
    private static final LazySingleton[] instances = new LazySingleton[3];

    private final int id;

    /**
     * Private constructor for the singleton instance.
     *
     * @param id the identifier of the singleton instance
     */
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    /**
     * Returns one of the three singleton instances by index, creating it if necessary.
     *
     * @param index the index of the singleton instance (0, 1, or 2)
     * @return the corresponding LazySingleton instance
     * @throws IllegalArgumentException if the index is not 0, 1, or 2
     */
    public static LazySingleton getInstance(int index) {
        if (index < 0 || index >= 3) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }
        if (instances[index] == null) {
            instances[index] = new LazySingleton(index);
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

