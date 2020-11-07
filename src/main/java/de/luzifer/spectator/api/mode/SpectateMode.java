package de.luzifer.spectator.api.mode;

import de.luzifer.spectator.api.entity.player.Spectator;

/**
 * Represents a SpectateMode
 * Used to create a new SpectateMode
 */
public abstract class SpectateMode {

    public SpectateMode(){}

    /**
     * Do something when the SpectateMode gets registered and enabled
     * For example register an EventListener
     */
    public abstract void onEnable();

    /**
     * Returns the description of the SpectateMode
     *
     * @return the description of the SpectateMode
     */
    public abstract String getDescription();

    /**
     * Returns the name of the SpectateMode
     *
     * @return the name of the SpectateMode
     */
    public abstract String getName();

    /**
     * Gets executed every Tick when a player has equipped this mode
     *
     * @param spectator the Spectator for which it will be executed
     */
    public abstract void execute(Spectator spectator);

    /**
     * Returns the raw Name of the SpectateMode without any special character or color codes
     *
     * @return the raw name
     */
    public String getRawName() {

        String currentName = getName();
        currentName = currentName.replaceAll("§([0-fk-or])", "");
        currentName = currentName.replaceAll("[^a-zA-Z0-9 ]", "");

        return currentName;
    }

    /**
     * Returns the raw Description of the SpectateMode without any special character or color codes
     *
     * @return the raw description
     */
    public String getRawDescription() {

        String currentDescription = getDescription();
        currentDescription = currentDescription.replaceAll("§([0-fk-or])", "");
        currentDescription = currentDescription.replaceAll("[^a-zA-Z0-9 ]", "");

        return currentDescription;
    }

}
