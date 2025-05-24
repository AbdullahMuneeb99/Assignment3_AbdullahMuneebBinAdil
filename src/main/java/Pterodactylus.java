/**
 * Represents a Pterodactylus, a flying reptile from the Jurassic era.
 * Extends the SkyAnimal class.
 */
public class Pterodactylus extends SkyAnimal {

    /**
     * Constructs a Pterodactylus instance with its name.
     */
    public Pterodactylus() {
        super("Pterodactylus");
    }

    /**
     * Describes the flying behavior of the Pterodactylus.
     *
     * @return A string describing its flying action.
     */
    public String getFlying() {
        return "soaring";
    }
}

