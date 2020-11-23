package de.luzifer.spectator.api.mode;

import de.luzifer.spectator.api.entity.player.Spectator;
import lombok.NonNull;

import java.util.List;

/**
 * Represents a SpectateMode
 * Used to create a new SpectateMode
 */
public abstract class SpectateMode {

    public SpectateMode(){}

    /**
     * Returns the description of the SpectateMode as list
     *
     * @return the description of the SpectateMode as list
     */
    @NonNull
    public abstract List<String> getDescription();

    /**
     * Returns the name of the SpectateMode
     *
     * @return the name of the SpectateMode
     */
    @NonNull
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
    public List<String> getRawDescription() {

        List<String> currentDescription = getDescription();

        for(String s : getDescription()) {
            s = s.replaceAll("§([0-fk-or])", "");
            s = s.replaceAll("[^a-zA-Z0-9 ]", "");
            currentDescription.add(s);
        }

        return currentDescription;
    }

}
