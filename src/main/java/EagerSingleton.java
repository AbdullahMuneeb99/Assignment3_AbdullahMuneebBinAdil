public class EagerSingleton {
    private static final EagerSingleton[] instances = new EagerSingleton[3];

    private final int id;

    private EagerSingleton(int id) {
        this.id = id;
        System.out.println("EagerSingleton " + id + " instantiated");
    }

    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
        }
    }

    public static EagerSingleton getInstance(int index) {
        if (index < 0 || index >= 3) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }
        return instances[index];
    }

    public int getId() {
        return id;
    }
}
