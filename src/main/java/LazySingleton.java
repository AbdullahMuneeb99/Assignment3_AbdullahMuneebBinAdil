public class LazySingleton {
    private static final LazySingleton[] instances = new LazySingleton[3];

    private final int id;

    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    public static LazySingleton getInstance(int index) {
        if (index < 0 || index >= 3) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }
        if (instances[index] == null) {
            instances[index] = new LazySingleton(index);
        }
        return instances[index];
    }

    public int getId() {
        return id;
    }
}
